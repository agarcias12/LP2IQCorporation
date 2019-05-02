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
import pe.edu.pucp.inf.iqgesttec.config.DBManager;
import pe.edu.pucp.inf.iqgesttec.dao.DAOLocalBoss;
import pe.edu.pucp.inf.iqgesttec.model.bean.LocalBoss;

/**
 *
 * @author alulab14
 */
public class MySQLLocalBoss implements DAOLocalBoss {

    @Override
    public LocalBoss queryById(int id) {

        String name = "";
        String lastName = "";
        String dni = "";
        String cellphone = "";
        
        try{
            DBManager dbmanager = DBManager.getDbManager();
            Connection con = DriverManager.getConnection(dbmanager.getUrl(), dbmanager.getUser(), dbmanager.getPassword());
            String sql = "SELECT * FROM LOCALBOSS WHERE ID_LOCALBOSS =" + id +";";
            PreparedStatement ps = 
                    con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString("NAME");
                lastName = rs.getString("LASTNAME");
                dni = rs.getString("DNI");
                cellphone = rs.getString("CELLPHONE");
            }
            con.close();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        LocalBoss lb = new LocalBoss(id,name,lastName,dni,cellphone);
        return lb;
    }
    
}
