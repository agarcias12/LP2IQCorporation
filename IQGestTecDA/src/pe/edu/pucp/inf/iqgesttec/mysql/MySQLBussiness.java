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
import java.sql.SQLException;
import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.config.DBManager;
import pe.edu.pucp.inf.iqgesttec.dao.DAOBussiness;
import pe.edu.pucp.inf.iqgesttec.model.bean.Bussiness;

/**
 *
 * @author alulab14
 */
public class MySQLBussiness implements DAOBussiness {

    @Override
    public ArrayList<Bussiness> queryAll() {
        ArrayList<Bussiness> listBuss = new ArrayList<>();
        try {
            DBManager dbManager = DBManager.getDbManager();
            Connection conn = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM BUSSINESS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bussiness bussiness = new Bussiness();
                bussiness.setName(rs.getString("NAME"));
                bussiness.setRuc(rs.getString("RUC"));
                bussiness.setActivity(rs.getString("ACTIVITY"));
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listBuss;
    }

    @Override
    public Bussiness queryById(int id) {
        Bussiness bussiness = new Bussiness();
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection conn = DriverManager.getConnection(dbManager.getUrl(), dbManager.getUser(), dbManager.getPassword());
            String sql = "SELECT * FROM BUSSINESS WHERE ID_BUSSINESS = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                bussiness.setName(rs.getString("NAME"));
                bussiness.setRuc(rs.getString("RUC"));
                bussiness.setActivity(rs.getString("ACTIVITY"));
            }
            conn.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return bussiness;
    }
}
