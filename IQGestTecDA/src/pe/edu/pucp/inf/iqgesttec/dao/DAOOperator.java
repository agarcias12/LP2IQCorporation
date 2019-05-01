/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Level;
import pe.edu.pucp.inf.iqgesttec.model.bean.Operator;

/**
 *
 * @author ASUS
 */
public interface DAOOperator {
    void CreateOperator(Operator operator, int idCas, int idUser);
    void ModifyOperator(int idOperator,Operator operator, int idCas);
    void ModifyLevel(int idOperator, Level level);
    void GetReport();
}
