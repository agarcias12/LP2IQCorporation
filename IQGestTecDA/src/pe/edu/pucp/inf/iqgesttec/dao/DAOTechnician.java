
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Efficiency;
import pe.edu.pucp.inf.iqgesttec.model.bean.Technician;

public interface DAOTechnician {
    int insert(Technician technician);
    int update(Technician technician);
    int delete(int id);

    ArrayList<Technician> queryAll();
    Technician queryById(int id);
}
