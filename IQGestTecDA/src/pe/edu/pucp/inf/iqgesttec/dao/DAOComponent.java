
package pe.edu.pucp.inf.iqgesttec.dao;

import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.model.bean.Component;

public interface DAOComponent {
    int insert(Component component,int idpos);
    int update(Component component,int idpos);
    int delete(int idComponent);

    Component queryById(int id);
    ArrayList<Component> queryAll();
}
