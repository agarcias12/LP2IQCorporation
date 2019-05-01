/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Bussiness;

/**
 *
 * @author ASUS
 */
public interface DAOBussiness {
    int CreateBussiness(Bussiness Bussiness);
    int ModifyBusiness(int idBussiness, Bussiness Bussiness);
    String ConsultBussiness(int idBussiness);
    String ConsultLocals(int idBusiness);
}
