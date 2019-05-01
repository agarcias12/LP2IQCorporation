/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Efficiency;
import pe.edu.pucp.inf.iqgesttec.model.bean.Technician;

/**
 *
 * @author ASUS
 */
public interface DAOTechnician {
    void CreateTechnician(Technician technician, int idCas, int idUser);
    void ModifyTechnician(int idTechnician, Technician technician, int idCas);
    void ModifyEfficiency(int idTechnician, Efficiency efficiency);
    void GenerateAgenda();//req.18
    
}
