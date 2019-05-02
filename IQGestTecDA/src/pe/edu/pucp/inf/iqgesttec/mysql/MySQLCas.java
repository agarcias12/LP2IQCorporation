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
import pe.edu.pucp.inf.iqgesttec.dao.DAOCas;
import pe.edu.pucp.inf.iqgesttec.model.bean.CAS;

/**
 *
 * @author alulab14
 */
public class MySQLCas implements DAOCas{

    @Override
    public ArrayList<CAS> queryAll() {
        int result = 0;
        ArrayList<CAS> lista = new ArrayList<CAS>();
        try{
            DBManager dbmanager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbmanager.getUrl(), dbmanager.getUser(), dbmanager.getPassword());
            String sql = "SELECT * FROM CAS";
            PreparedStatement ps = 
                    con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String address = rs.getString("ADDRESS");
                String district = rs.getString("DISTRICT");
                CAS cas = new CAS(address,district);
                lista.add(cas);
            }
            con.close();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return lista;
    }

    @Override
    public CAS queryById(int id) {
        int result = 0;
        String address = "";
        String district = ""; 
        try{
            DBManager dbmanager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbmanager.getUrl(), dbmanager.getUser(), dbmanager.getPassword());
            String sql = "SELECT * FROM CAS WHERE ID_CAS =" + id +";" ;
            PreparedStatement ps = 
                    con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                address = rs.getString("ADDRESS");
                district = rs.getString("DISTRICT");
            }
            con.close();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        CAS cas = new CAS(address,district);
        return cas;
    }
}
