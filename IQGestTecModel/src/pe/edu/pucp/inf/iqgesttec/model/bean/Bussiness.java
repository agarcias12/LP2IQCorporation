/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.model.bean;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Bussiness {
    private int id;
    private String name;
    private String ruc;
    private ArrayList<Local> locals;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the locals
     */
    public ArrayList<Local> getLocals() {
        return locals;
    }

    public int getId() {
        return id;
    }

    public Bussiness(String name, String ruc) {
        this.name = name;
        this.ruc = ruc;
        this.locals = new ArrayList<>();
    }
}
