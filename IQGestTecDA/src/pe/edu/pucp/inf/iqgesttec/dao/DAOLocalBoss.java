/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.LocalBoss;

/**
 *
 * @author ASUS
 */
public interface DAOLocalBoss {
    void CreateLocalBoss(LocalBoss localBoss);
    void ModifyLocalBoss(int idLocalBoss, LocalBoss localBoss);
    String ConsultarLocalBoss(int idLocalBoss);
}
