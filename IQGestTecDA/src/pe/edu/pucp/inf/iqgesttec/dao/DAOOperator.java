
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Operator;

public interface DAOOperator {
    // operator usa getEmployeeData casteando el Operator generado antes de obtener su data
    Operator queryById(int idOperator);
}
