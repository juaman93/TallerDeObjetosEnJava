import java.util.Date;

/**
 * Representa una persona y sus atributos.
 *
 *  @author Juan Manuel Montealegre
 */
public class Person {

    //Atributos

    /**
     * Representa el nombre de la persona.
     */
    public String name;
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public Date dateBirth = new Date();
    /**
     * Representa la altura de la persona.
     */
    public float height;

    //Métodos

    /**
     *
     * @return Devuelve el nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Asigna el nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Devuelve el primer apellido de la persona.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     *
     * @param lastName1 Asigna el primer apellido de la persona.
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     *
     * @return Devuelve el segundo apellido de la persona.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     *
     * @param lastName2 Asigna el segundo apellido de la persona.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     *
     * @return Devuelve la fecha de nacimiento de la persona.
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     *
     * @param dateBirth Asigna la fecha de nacimiento de la persona.
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     *
     * @return Devuelve la altura de la persona.
     */
    public float getHeight() {
        return height;
    }

    /**
     *
     * @param height Asigna la altura de la persona.
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
