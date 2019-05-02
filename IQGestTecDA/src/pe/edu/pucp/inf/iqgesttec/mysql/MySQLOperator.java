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
import pe.edu.pucp.inf.iqgesttec.config.DBManager;
import pe.edu.pucp.inf.iqgesttec.dao.DAOOperator;
import pe.edu.pucp.inf.iqgesttec.model.bean.Level;
import pe.edu.pucp.inf.iqgesttec.model.bean.Operator;

/**
 *
 * @author alulab14
 */
public class MySQLOperator implements DAOOperator{

    @Override
    public int CreateOperator(Operator operator, int idCas) {
        int result = 0;
        try{
            DBManager dbmanager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbmanager.getUrl(), dbmanager.getUser(), dbmanager.getPassword());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//            "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20141717", 
//            "a20141717","W94SYS");
            String sql = "INSERT INTO  `EMPLOYEE` ( `FID_CAS` ,  "
                    + "`NAME` ,  `LASTNAME` ,  `CELLPHONE` ,  `DNI` ,  `ADDRESS` ,  `DISTRICT` )  "
                    + "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = 
                    con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idCas);
            ps.setString(2, operator.getName());
            ps.setString(3, operator.getLastname());
            ps.setString(4, operator.getCellphone());
            ps.setString(5, operator.getDni());
            ps.setString(6, operator.getAddress());
            ps.setString(7, operator.getDistrict());           
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    result = generatedKeys.getInt(1);
                    operator.setId(generatedKeys.getInt(1));
                }
                else {
                    System.out.println("Error al insertar Employee");
                }
            }
            sql = "INSERT INTO OPERATOR("
                    + "FID_EMPLOYEE,LEVEL) "
                    + "VALUES(?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, result);
            ps.setString(2, operator.getLevel().name());
            ps.executeUpdate();
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public void ModifyOperator(int idOperator, Operator operator, int idCas) {
        int result = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20141717", 
            "a20141717","W94SYS");
            String sql;
            if (idCas != 0){ //estamos modificando el CAS
                sql = "UPDATE `EMPLOYEE` SET `FID_CAS`  = ?,  "
                    + " `NAME` = ? ,  `LASTNAME` = ?,  `CELLPHONE` = ? ,  `DNI` = ?,"
                        + "  `ADDRESS` = ? ,  `DISTRICT` = ? )  WHERE ID_EMPLOYEE = " + idOperator + ";";
                PreparedStatement ps = 
                    con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, idCas);
                ps.setString(2, operator.getName());
                ps.setString(3, operator.getLastname());
                ps.setString(4, operator.getCellphone());
                ps.setString(5, operator.getDni());
                ps.setString(6, operator.getAddress());
                ps.setString(7, operator.getDistrict());   
                ps.executeUpdate();
            } else { // el resto de datos
                sql = "UPDATE `EMPLOYEE` SET"
                    + " `NAME` = ? ,  `LASTNAME` = ?,  `CELLPHONE` = ? ,  `DNI` = ?,"
                        + "  `ADDRESS` = ? ,  `DISTRICT` = ? )  WHERE ID_EMPLOYEE = " + idOperator + ";";
                PreparedStatement ps = 
                    con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, operator.getName());
                ps.setString(2, operator.getLastname());
                ps.setString(3, operator.getCellphone());
                ps.setString(4, operator.getDni());
                ps.setString(5, operator.getAddress());
                ps.setString(6, operator.getDistrict());   
                ps.executeUpdate();
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void ModifyLevel(int idOperator, Level level) {
        int result = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20141717", 
            "a20141717","W94SYS");
            String sql = "UPDATE `OPERATOR` SET `LEVEL`  = ? WHERE FID_EMPLOYEE = " + idOperator + ";";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, level.name());
            ps.executeUpdate();
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }    
    
    @Override
    public void GetReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
