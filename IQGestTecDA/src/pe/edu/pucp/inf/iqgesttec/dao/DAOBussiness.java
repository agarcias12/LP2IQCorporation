
package pe.edu.pucp.inf.iqgesttec.dao;

import java.util.ArrayList;

import pe.edu.pucp.inf.iqgesttec.model.bean.Bussiness;

public interface DAOBussiness {
    Bussiness queryById(int id);
    ArrayList<Bussiness> queryAll();
}
