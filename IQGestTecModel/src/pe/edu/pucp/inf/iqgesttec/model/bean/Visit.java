/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.model.bean;
import java.util.Date;
/**
 *
 * @author ASUS
 */
public class Visit{
    private Technician technician;
    private Date date;
    private Attention attended;
    private double duration;
    
    public Visit(Technician technician, Date date, Attention attended, double duration) {
        this.technician = technician;
        this.date = date;
        this.attended = attended;
        this.duration = duration;
    }
    
    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attention getAttended() {
        return attended;
    }

    public void setAttended(Attention attended) {
        this.attended = attended;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
