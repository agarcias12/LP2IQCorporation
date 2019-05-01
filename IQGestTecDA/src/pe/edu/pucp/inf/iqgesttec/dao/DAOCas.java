
package pe.edu.pucp.inf.iqgesttec.dao;

import java.util.ArrayList;

import pe.edu.pucp.inf.iqgesttec.model.bean.CAS;

public interface DAOCas {
    ArrayList<CAS> queryAll();
    CAS queryById(int id);
}
