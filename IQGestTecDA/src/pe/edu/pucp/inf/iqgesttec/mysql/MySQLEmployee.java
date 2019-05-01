/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import pe.edu.pucp.inf.iqgesttec.dao.DAOEmployee;
import pe.edu.pucp.inf.iqgesttec.model.bean.Employee;

/**
 *
 * @author alulab14
 */
public class MySQLEmployee implements DAOEmployee{

    @Override
    public int CreateEmployee(Employee emp, int idCas, int idUser) {
        int result = 0;
            try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://quilla.lab.inf.pucp.edu.pe:3306/inf282g2", 
        "inf282g2", 
        "9D2hNa");
        String sql = "INSERT INTO EMPLOYEE("
                + "FIRST_NAME,AGE,CRAEST) "
                + "VALUES(?,?,?)";
        PreparedStatement ps = 
                con.prepareStatement(sql);
//        ps.setString(1, student.getFirstName());
//        ps.setInt(2, student.getAge());
//        ps.setFloat(3, student.getCRAEST());
//        result = ps.executeUpdate();
        con.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        return result;
    }

    @Override
    public int ModifyEmployee(int idEmp, Employee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int DeleteEmployee(int idEmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
