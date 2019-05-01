/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Incident;

/**
 *
 * @author ASUS
 */
public interface DAOIncident {
    void CreateIncident(Incident incident); //req4
    void ModifyIncident(int idInc, Incident incident);
    String ConsultIncident();
    String AddAnnotation(); //OP1 añadir anotaciones req 8
    String AddDescriptionSol();//req.7
    void InsertComponentUsexIncident();//req 11
    void InsertComponentDamagexIncident();
    void ShowVisitsxIncident(); //req15
    void escalateIncidence(String desc); //escala incidencia a nivel 2
    void addNewSolution(String desc,int idOperator);//req24
    void cleanHistory(); //req23
}
