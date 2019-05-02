
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Operator;

public interface DAOOperator {
    // operator usa getEmployeeData casteando el Operator generado antes de obtener
    // su data
    int CreateOperator(Operator operator, int idCas);

    void ModifyOperator(int idOperator, Operator operator, int idCas);

    void ModifyLevel(int idOperator, Level level);
}
