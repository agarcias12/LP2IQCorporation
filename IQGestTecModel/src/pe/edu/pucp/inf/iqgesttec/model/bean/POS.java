/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.model.bean;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class POS{
    private int id;
    private Local local;
    private String serial;
    private Date dischargedDate;
    private Date updateDate;
    private ArrayList<Component> components;
    private boolean state;

    public POS(String serial, Date dischargedDate, Date updateDate, boolean state, Local local) {
        this.local = local;
        this.serial = serial;
        this.dischargedDate = dischargedDate;
        this.updateDate = updateDate;
        this.components = new ArrayList<>();
        this.state = state;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the dischargedDate
     */
    public Date getDischargedDate() {
        return dischargedDate;
    }

    /**
     * @param dischargedDate the dischargedDate to set
     */
    public void setDischargedDate(Date dischargedDate) {
        this.dischargedDate = dischargedDate;
    }

    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the components
     */
    public ArrayList<Component> getComponents() {
        return components;
    }

    /**
     * @return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }
}