
package pe.edu.pucp.inf.iqgesttec.model.bean;
import java.util.ArrayList;

public class Solution{
    private int id;
    private int level;
    private Operator operator;
    private String description;
    private boolean solved;
    private ArrayList<Visit> visits;

    public Solution(int level, Operator operator, String description, boolean solved) {
        this.level = level;
        this.operator = operator;
        this.description = description;
        this.solved = solved;
        this.visits = new ArrayList<>();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void addVisit(Visit visit) {
      this.visits.add(visit);
    };
}
