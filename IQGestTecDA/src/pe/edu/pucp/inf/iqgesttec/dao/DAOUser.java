/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.User;

/**
 *
 * @author ASUS
 */
public interface DAOUser {
    int CreateUser(User user);
    void ModifyUser(int id, User user);
    void ValidateUser(int id);
}
