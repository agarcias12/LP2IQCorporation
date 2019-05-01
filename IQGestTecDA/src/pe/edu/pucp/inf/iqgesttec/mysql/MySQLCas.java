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
import pe.edu.pucp.inf.iqgesttec.dao.DAOCas;
import pe.edu.pucp.inf.iqgesttec.model.bean.CAS;

/**
 *
 * @author alulab14
 */
public class MySQLCas implements DAOCas{

    @Override
    public int CreateCas(CAS cas) {
        int result = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20141717", 
            "a20141717","W94SYS");
            String sql = "INSERT INTO CAS("
                    + "ADDRESS,DISTRICT) "
                    + "VALUES(?,?)";
            PreparedStatement ps = 
                    con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cas.getAddress());
            ps.setString(2, cas.getDistrict());
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    result = generatedKeys.getInt(1);
                    cas.setId(generatedKeys.getInt(1));
                }
                else {
                    System.out.println("Error al insertar CAS");
                }
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int ModifyCas(int idCas, CAS cas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
