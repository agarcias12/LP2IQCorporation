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
public class Operator extends Employee{
    private Level level;

    public Operator(Level level, String dni, String name, String lastname, String cellphone, String address, String district) {
        super(dni, name, lastname, cellphone,address,district);
        this.level = level;
    }

    /**
     * @return the level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Level level) {
        this.level = level;
    }
}
