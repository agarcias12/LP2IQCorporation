/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Component;

/**
 *
 * @author ASUS
 */
public interface DAOComponent {
    int CreateComponent(Component component);
    int ModifyComponent(int idComponent, Component component);
    int DeleteComponent(int idComponent);
}
