
package pe.edu.pucp.inf.iqgesttec.model.bean;

public class Technician extends Employee{
    private Efficiency efficiency;

    public Technician(Efficiency efficiency, String dni, String name, String lastname, String cellphone,String address, String district) {
        super(dni, name, lastname, cellphone,address,district);
        this.efficiency = efficiency;
    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }
}
