/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.config.DBManager;
import pe.edu.pucp.inf.iqgesttec.dao.DAOComponent;
import pe.edu.pucp.inf.iqgesttec.model.bean.Component;
import pe.edu.pucp.inf.iqgesttec.model.bean.State;

/**
 *
 * @author alulab14
 */
public class MySQLComponent implements DAOComponent{

    @Override
    public int insert(Component component,int idpos) {
        int resp=0;
        try {
            DBManager dbManager=DBManager.getDbManager();
            Connection con=DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20151196", "a20151196", "1Q7DYb");
            String sql ="INSERT INTO COMPONENT (FID_POS,SERIAL_NUMBER,DESCRIPTION,ACTUAL_STATE,IN_USE,ACTIVE)"+
                    "VALUES(?,?,?,?,?,1)";
            PreparedStatement ps =con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idpos);
            ps.setString(2,component.getSerial());
            ps.setString(3,component.getDescription());
            ps.setString(4,component.getState().toString());
            int i=0;
            if(component.isActive()){
                i=1;
            }
            ps.setInt(5,i);
            ps.executeUpdate();
            try(ResultSet generatedKeys = ps.getGeneratedKeys()){
                if (generatedKeys.next()) {
                    resp = generatedKeys.getInt(1);
                    component.setId(generatedKeys.getInt(1));
                }
                else {
                    System.out.println("Error al insertar CAS");
                }
            }
            con.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return resp;
    }

    @Override
    public int update(Component component,int idpos) {
        int resp=0;
        try {
            DBManager dbManager=DBManager.getDbManager();
            Connection con=DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20151196", "a20151196", "1Q7DYb");
            String sql ="UPDATE COMPONENT SET FID_POS=?,SERIAL_NUMBER=?,DESCRIPTION=?,ACTUAL_STATE=?,IN_USE=? WHERE ID_COMPONENT=? AND ACTIVE=1";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,idpos);
            ps.setString(2,component.getSerial());
            ps.setString(3,component.getDescription());
            ps.setString(4,component.getState().toString());
            int i=0;
            if(component.isActive()){
                i=1;
            }
            ps.setInt(5,i);
            ps.setInt(6, component.getId());
            resp=ps.executeUpdate();
            con.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return resp;
    }

    @Override
    public int delete(int idComponent) {
        int resp=0;
        try {
            DBManager dbManager=DBManager.getDbManager();
            Connection con=DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20151196", "a20151196", "1Q7DYb");
            String sql ="UPDATE COMPONENT SET ACTIVE=0 WHERE ID_COMPONENT=?";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,idComponent);
            resp=ps.executeUpdate();
            con.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return resp;
    }

    @Override
    public Component queryById(int id) {
        Component component = new Component();
        try{
            DBManager dbManager=DBManager.getDbManager();
            Connection con=DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20151196", "a20151196", "1Q7DYb");
            String sql="SELECT * FROM STUDENT WHERE ID_COMPONENT=? AND ACTIVE=1";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery(sql);
            if(rs.first()){
                component.setId(rs.getInt("ID_COMPONENT"));
                component.setDescription(rs.getString("DESCRIPTION"));
                String op = rs.getString("ACTUAL_STATE");
                State state=Utils.convertState(op);
                component.setState(state);
                component.setActive(rs.getBoolean("IN_USE"));
                component.setSerial(rs.getString("SERIAL_NUMBER"));
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return component;
    }

    @Override
    public ArrayList<Component> queryAll() {
        ArrayList<Component> listC= new ArrayList<>();
        try{
            DBManager dbManager=DBManager.getDbManager();
            Connection con=DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20151196", "a20151196", "1Q7DYb");
            String sql="SELECT * FROM STUDENT WHERE ACTIVE=1";
            Statement ps= con.createStatement();
            ResultSet rs=ps.executeQuery(sql);
            while(rs.next()){
                Component component=new Component();
                component.setId(rs.getInt("ID_COMPONENT"));
                component.setDescription(rs.getString("DESCRIPTION"));
                String op = rs.getString("ACTUAL_STATE");
                State state=Utils.convertState(op);
                component.setState(state);
                component.setActive(rs.getBoolean("IN_USE"));
                component.setSerial(rs.getString("SERIAL_NUMBER"));
                listC.add(component);
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return listC;
    }
    
}
