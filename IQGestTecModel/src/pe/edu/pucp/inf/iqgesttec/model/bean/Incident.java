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
public class Incident {
    private int id;
    private POS pos;
    private CAS cas;
    private String description;
    private String level;
    private Operator operator;
    private ArrayList<Visit> visits;
    private Date reportedDate;
    
    public Incident(POS pos, CAS cas, String description, Date reportedDate) {
        this.pos = pos;
        this.description = description;
        this.visits = new ArrayList<Visit>();
        this.reportedDate = reportedDate;
        this.cas = cas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public POS getPos() {
        return pos;
    }

    public void setPos(POS pos) {
        this.pos = pos;
    }

    public CAS getCas() {
        return cas;
    }

    public void setCas(CAS cas) {
        this.cas = cas;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
    
}
