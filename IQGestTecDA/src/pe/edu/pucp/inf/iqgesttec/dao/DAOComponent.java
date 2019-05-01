
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Component;

public interface DAOComponent {
    /* id de pos no es necesario para crear el componente */
    int insert(Component component);
    int modify(Component component);
    int delete(int id);

    ArrayList<Component> queryAll();
    Component queryById(int id);
}
