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
public class CAS {
    private int id;
    private String address;
    private String district;
    private ArrayList<Employee> employees;
    private ArrayList<Local> locals;

    public CAS(String address, String district) {
        this.address = address;
        this.district = district;
        this.employees = new ArrayList<>();
        this.locals = new ArrayList<>();
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
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

    public void setId(int id) {
        this.id = id;
    }
    
}
