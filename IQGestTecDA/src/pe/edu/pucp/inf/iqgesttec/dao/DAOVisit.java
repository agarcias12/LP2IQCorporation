/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;
import pe.edu.pucp.inf.iqgesttec.model.bean.Attention;

/**
 *
 * @author ASUS
 */
public interface DAOVisit {
    void CreatVisit();
    void ModifyVisit();
    void InsertComponentUsexVisit();
    void InsertComponentDamagexVisit();
    //void ModifyAttention();
    void updateAttendance(Attention attention);
}
