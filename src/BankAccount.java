/**
 * Representa una cuenta de banco y varios de sus atributos, como su número de cuenta, si ha sido activada y su contraseña.
 *
 *  @author Juan Manuel Montealegre
 */
public class BankAccount {

    //Atributos

    /**
     * Representa el número de cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa la contraseña de la cuenta de banco.
     */
    private int password;
    /**
     * Representa si la cuenta esta activa o no.
     */
    protected boolean activated;

    //Métodos

    /**
     *
     * @return Devuelve el número de cuenta.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @param accountNumber Asigna un número de cuenta a la variable.
     */
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * password - nuevo atributo añadido a la clase, ya que tiene sentido tener una contraseña para la cuenta de banco.
     * @return Devuelve la contraseña.
     */
    private int getPassword() {
        return password;
    }

    /**
     *
     * @param password Asigna una contraseña a la variable.
     */
    private void setPassword(int password) {
        this.password = password;
    }

    /**
     * activated - Hice una pequeña modificación aquí: en lugar de usar "get" estoy usando "is" para expresar semánticamente el código de una mejor manera
     * @return Devuelve una variable booleana, es decir, si la cuenta está activa o no.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     *
     * @param activated Asigna un valor booleano a la variable, dependiendo de si la cuenta está activa o no.
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
