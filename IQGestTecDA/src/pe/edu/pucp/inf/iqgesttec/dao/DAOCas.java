/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.CAS;

/**
 *
 * @author ASUS
 */
public interface DAOCas {
    int CreateCas(CAS cas);
    int ModifyCas(int idCas, CAS cas);
}
