
package pe.edu.pucp.inf.iqgesttec.dao;

import pe.edu.pucp.inf.iqgesttec.model.bean.Solution;

public interface DAOSolution {
    int insert(Solution solution);
    int update(Solution solution);
    int delete(Solution solution);

    ArrayList<Solution> queryAll();
    Solution queryById(int id);
}
