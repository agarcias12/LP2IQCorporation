/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqgesttec;

import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.dao.DAOCas;
import pe.edu.pucp.inf.iqgesttec.dao.DAOEmployee;
import pe.edu.pucp.inf.iqgesttec.dao.DAOOperator;
import pe.edu.pucp.inf.iqgesttec.dao.DAOTechnician;
import pe.edu.pucp.inf.iqgesttec.dao.DAOUser;
import pe.edu.pucp.inf.iqgesttec.model.bean.CAS;
import pe.edu.pucp.inf.iqgesttec.model.bean.Efficiency;
import pe.edu.pucp.inf.iqgesttec.model.bean.Employee;
import pe.edu.pucp.inf.iqgesttec.model.bean.Level;
import pe.edu.pucp.inf.iqgesttec.model.bean.Operator;
import pe.edu.pucp.inf.iqgesttec.model.bean.Role;
import pe.edu.pucp.inf.iqgesttec.model.bean.Technician;
import pe.edu.pucp.inf.iqgesttec.model.bean.User;
import pe.edu.pucp.inf.iqgesttec.mysql.MySQLCas;
import pe.edu.pucp.inf.iqgesttec.mysql.MySQLEmployee;
import pe.edu.pucp.inf.iqgesttec.mysql.MySQLOperator;
import pe.edu.pucp.inf.iqgesttec.mysql.MySQLTechnician;
import pe.edu.pucp.inf.iqgesttec.mysql.MySQLUser;

/**
 *
 * @author alulab14
 */
public class IQGestTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idUs, idCas;
        ArrayList<CAS> listaCas = new ArrayList<CAS>();
        // Esta es la forma de crear un nuevo employee
        Role role1 = Role.Operator1;
        Role role2 = Role.Operator2;
        Role role3 = Role.Technician;
        Level lvl1 = Level.CallCenter;
        Efficiency ef1 = Efficiency.High;
        Efficiency ef2 = Efficiency.Medium;
        //ingresamos un CAS
        DAOCas daocas = new MySQLCas();
        listaCas = daocas.queryAll();
        
        
        
    }
    
}
