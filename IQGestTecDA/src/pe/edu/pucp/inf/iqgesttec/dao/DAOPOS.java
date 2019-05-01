/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;
import java.util.ArrayList;
import pe.edu.pucp.inf.iqgesttec.model.bean.Component;
import pe.edu.pucp.inf.iqgesttec.model.bean.POS;

/**
 *
 * @author ASUS
 */
public interface DAOPOS {
    void CreatePOS(POS pos);//req 12
    void ModifyPOS(int idPos,POS pos);
    void DeletePOS(int idPos);
    String ObtenerDatosLocal(int idPos);
    void ChangeState();
    void CaptureDate();  
    boolean ValidatePOS();
    ArrayList<Component> ComponentsStatus(); //obtiene lista de componentes
    void registerComponent(Component component); //req13
    void deleteComponent(String serial); //req13
    String getReport(); //req27
}
