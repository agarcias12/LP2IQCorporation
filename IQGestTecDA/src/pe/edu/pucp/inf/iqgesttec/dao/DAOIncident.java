
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Incident;

public interface DAOIncident {
    int insert(Incident incident);
    int update(Incident incident);
    int delete(int id);

    ArrayList<Incident> queryAll();
    Incident queryById(int id);
}
