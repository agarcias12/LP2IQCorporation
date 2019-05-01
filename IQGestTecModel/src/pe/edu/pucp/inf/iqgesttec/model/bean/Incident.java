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
    private ArrayList<Solution> solutions;
    private Date reportedDate;

    public Incident(POS pos, CAS cas, String description, Date reportedDate) {
        this.pos = pos;
        this.description = description;
        this.solutions = new ArrayList<Solution>();
        this.reportedDate = reportedDate;
        this.cas = cas;
    }
    
    /**
     * @return the pos
     */
    public POS getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(POS pos) {
        this.pos = pos;
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

    /**
     * @return the solutions
     */
    public ArrayList<Solution> getSolutions() {
        return solutions;
    }

    /**
     * @return the reportedDate
     */
    public Date getReportedDate() {
        return reportedDate;
    }

    /**
     * @param reportedDate the reportedDate to set
     */
    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public CAS getCas() {
        return cas;
    }

    public void setCas(CAS cas) {
        this.cas = cas;
    }

    public int getId() {
        return id;
    }
}
