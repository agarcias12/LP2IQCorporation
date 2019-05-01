/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Employee;

/**
 *
 * @author ASUS
 */
public interface DAOEmployee {
    int CreateEmployee(Employee emp, int idCas);
    int ModifyEmployee(int idEmp, Employee emp);
    int DeleteEmployee(int idEmp);
}
