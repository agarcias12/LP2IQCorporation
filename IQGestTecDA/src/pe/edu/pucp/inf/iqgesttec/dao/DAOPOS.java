
package pe.edu.pucp.inf.iqgesttec.dao;
import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.model.bean.POS;

public interface DAOPOS {
    int insert(POS pos);
    int update(POS pos);
    int delete(int id);

    POS queryById(int id);
    ArrayList<POS> queryAll();
}
