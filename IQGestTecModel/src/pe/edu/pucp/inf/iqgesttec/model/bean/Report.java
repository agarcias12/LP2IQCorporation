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
public class Report {
    private int id;
    private ArrayList<Component> damagedComponents;
    private ArrayList<Component> usedComponents;
    private String description;

    public Report(String description) {
        this.damagedComponents = new ArrayList<>();
        this.usedComponents = new ArrayList<>();
        this.description = description;
    }

    /**
     * @return the damagedComponents
     */
    public ArrayList<Component> getDamagedComponents() {
        return damagedComponents;
    }

    /**
     * @return the usedComponents
     */
    public ArrayList<Component> getUsedComponents() {
        return usedComponents;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
