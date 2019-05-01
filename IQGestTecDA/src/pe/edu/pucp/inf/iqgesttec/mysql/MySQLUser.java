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
import pe.edu.pucp.inf.iqgesttec.dao.DAOUser;
import pe.edu.pucp.inf.iqgesttec.model.bean.User;

/**
 *
 * @author alulab14
 */
public class MySQLUser implements DAOUser{

    @Override
    public int CreateUser(User user) {
        int result = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/a20141717", 
            "a20141717","W94SYS");
            String sql = "INSERT INTO USER("
                    + "EMAIL,PASSWORD,ROLE) "
                    + "VALUES(?,?,?)";
            PreparedStatement ps = 
                    con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPasswordHash());
            ps.setString(3, user.getRole().name());
            ps.executeUpdate();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    result = generatedKeys.getInt(1);
                    user.setId(generatedKeys.getInt(1));
                }
                else {
                    System.out.println("Error al insertar Usuario");
                }
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public void ModifyUser(int id, User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ValidateUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
