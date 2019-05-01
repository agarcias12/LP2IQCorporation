/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.model.bean;

/**
 *
 * @author ASUS
 */
public class Technician extends Employee{
    private Efficiency efficiency;

    public Technician(Efficiency efficiency, String dni, String name, String lastname, String cellphone,String address, String district) {
        super(dni, name, lastname, cellphone,address,district);
        this.efficiency = efficiency;
    }
    
    /**
     * @return the efficiency
     */
    public Efficiency getEfficiency() {
        return efficiency;
    }

    /**
     * @param efficiency the efficiency to set
     */
    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }
}
