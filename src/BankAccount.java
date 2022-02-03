public class BankAccount {

    //Attributes
    private int accountNumber;
    private int password;
    protected boolean activated;

    //Methods - Getters and Setters for each one of the attributes

    //accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //password - new attribute added to the class as it made sense to have a password for the bank account
    private int getPassword() {
        return password;
    }
    private void setPassword(int password) {
        this.password = password;
    }

    //activated - Did a little modification here: instead of using "get" I'm using "is" to semantically express the code in a better way
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
