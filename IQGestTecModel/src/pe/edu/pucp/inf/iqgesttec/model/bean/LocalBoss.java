package pe.edu.pucp.inf.iqgesttec.model.bean;

public class LocalBoss {
    private int id;
    private String name;
    private String lastName;
    private String dni;
    private String cellphone;

    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the cellphone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public LocalBoss(String name, String lastName, String dni, String cellphone) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.cellphone = cellphone;
    }
}
