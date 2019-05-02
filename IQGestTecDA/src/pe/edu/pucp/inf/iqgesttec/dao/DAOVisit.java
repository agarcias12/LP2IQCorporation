
package pe.edu.pucp.inf.iqgesttec.dao;
import pe.edu.pucp.inf.iqgesttec.model.bean.Visit;

public interface DAOVisit {
    int insert(Visit visit);
    int update(Visit visit);
    int delete(int id);
}
