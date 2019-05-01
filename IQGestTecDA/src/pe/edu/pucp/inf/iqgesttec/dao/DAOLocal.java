/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;
import pe.edu.pucp.inf.iqgesttec.model.bean.Local;
import pe.edu.pucp.inf.iqgesttec.model.bean.POS;

/**
 *
 * @author ASUS
 */
public interface DAOLocal {
    void CrearLocal(Local local);
    void ModifyLocal(int idLocal, Local local);
    String ConsultarLocal(int idLocal);
    String ConsultarPOS();
    void addPOS(POS pos);
}

