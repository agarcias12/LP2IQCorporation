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
public class Local {
    private int id;
    private String name;
    private String address;
    private String district;
    private LocalBoss localBoss;
    private ArrayList<POS> posList;
    private Bussiness bussiness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public LocalBoss getLocalBoss() {
        return localBoss;
    }

    public ArrayList<POS> getPos() {
        return posList;
    }

    public int getId() {
        return id;
    }

    public Bussiness getBussiness() {
        return bussiness;
    }

    public void setBussiness(Bussiness bussiness) {
        this.bussiness = bussiness;
    }

    public Local(String name, String address, String district, LocalBoss localBoss, Bussiness bussiness) {
        this.name = name;
        this.address = address;
        this.district = district;
        this.localBoss = localBoss;
        this.posList = new ArrayList<POS>();
        this.bussiness = bussiness;
    }
}
