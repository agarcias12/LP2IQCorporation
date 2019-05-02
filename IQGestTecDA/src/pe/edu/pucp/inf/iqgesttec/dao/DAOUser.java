
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.User;

public interface DAOUser {
    int CreateUser(User user);
    void ModifyUser(int id, User user);
    void ValidateUser(int id);
}
