
package pe.edu.pucp.inf.iqgesttec.dao;

public interface DAOSolution {
    int insert(Solution solution);
    int update(Solution solution);
    int delete(Solution solution);

    Solution queryById(int id);
    ArrayList<Solution>queryAll();
}
