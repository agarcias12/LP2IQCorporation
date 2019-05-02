/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import pe.edu.pucp.inf.iqgesttec.config.DBManager;
import pe.edu.pucp.inf.iqgesttec.dao.DAOTechnician;
import pe.edu.pucp.inf.iqgesttec.model.bean.Efficiency;
import pe.edu.pucp.inf.iqgesttec.model.bean.Technician;

/**
 *
 * @author alulab14
 */
public class MySQLTechnician implements DAOTechnician{

    @Override
    public void CreateTechnician(Technician technician, int idCas, int idUser) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection conn = DriverManager.getConnection(dbManager.getUrl(),dbManager.getUser(),dbManager.getPassword());
            String sql = "INSERT INTO  `EMPLOYEE` (  `ID_EMPLOYEE` ,  `FID_CAS` ,  "
                    + "`FID_USER` ,  `NAME` ,  `LASTNAME` ,  `CELLPHONE` ,  `DNI` ,  `ADDRESS` ,  `DISTRICT` )  "
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = 
                    conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,idUser);
            ps.setInt(2, idCas);
            ps.setInt(3, idUser);
            ps.setString(4, technician.getName());
            ps.setString(5, technician.getLastname());
            ps.setString(6, technician.getCellphone());
            ps.setString(7, technician.getDni());
            ps.setString(8, technician.getAddress());
            ps.setString(9, technician.getDistrict());           
            ps.executeUpdate();
            sql = "INSERT INTO TECHNICIAN("
                    + "FID_EMPLOYEE,EFFICIENCY) "
                    + "VALUES(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idUser);
            ps.setString(2, technician.getEfficiency().name());
            ps.executeUpdate();
            conn.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void ModifyTechnician(int idTechnician, Technician technician, int idCas) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection conn = DriverManager.getConnection(dbManager.getUrl(),dbManager.getUser(),dbManager.getPassword());
            String sql;
            if (idCas != 0){ //estamos modificando el CAS
                sql = "UPDATE `EMPLOYEE` SET `FID_CAS`  = ?,  "
                    + " `NAME` = ? ,  `LASTNAME` = ?,  `CELLPHONE` = ? ,  `DNI` = ?,"
                        + "  `ADDRESS` = ? ,  `DISTRICT` = ? )  WHERE ID_EMPLOYEE = " + idTechnician + ";";
                PreparedStatement ps = 
                    conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, idCas);
                ps.setString(2, technician.getName());
                ps.setString(3, technician.getLastname());
                ps.setString(4, technician.getCellphone());
                ps.setString(5, technician.getDni());
                ps.setString(6, technician.getAddress());
                ps.setString(7, technician.getDistrict());   
                ps.executeUpdate();
            } else { // el resto de datos
                sql = "UPDATE `EMPLOYEE` SET"
                    + " `NAME` = ? ,  `LASTNAME` = ?,  `CELLPHONE` = ? ,  `DNI` = ?,"
                        + "  `ADDRESS` = ? ,  `DISTRICT` = ? )  WHERE ID_EMPLOYEE = " + idTechnician + ";";
                PreparedStatement ps = 
                    conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, technician.getName());
                ps.setString(2, technician.getLastname());
                ps.setString(3, technician.getCellphone());
                ps.setString(4, technician.getDni());
                ps.setString(5, technician.getAddress());
                ps.setString(6, technician.getDistrict());   
                ps.executeUpdate();
            }
            conn.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void ModifyEfficiency(int idTechnician, Efficiency efficiency) {
        int result = 0;
        try{
            DBManager dbManager = DBManager.getDbManager();
            Connection conn = DriverManager.getConnection(dbManager.getUrl(),dbManager.getUser(),dbManager.getPassword());
            String sql = "UPDATE `TECHNICIAN` SET `EFFICIENCY`  = ? WHERE FID_EMPLOYEE = " + idTechnician + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, efficiency.name());
            ps.executeUpdate();
            conn.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void GenerateAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
