
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Employee;

public interface DAOEmployee {
    int insert(Employee emp);
    int update(Employee emp);
    int delete(int id);

    void getEmployeeData(Employee emp);
}
