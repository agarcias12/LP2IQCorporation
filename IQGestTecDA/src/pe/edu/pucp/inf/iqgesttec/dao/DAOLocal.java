/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;
import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.model.bean.Local;
import pe.edu.pucp.inf.iqgesttec.model.bean.POS;

public interface DAOLocal {
    Local queryById(int id);
    ArrayList<Local>  queryAll();
}
