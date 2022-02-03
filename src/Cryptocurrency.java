public class Cryptocurrency {

    //Attributes
    public int supply;
    public int price;
    public String address;
    private String vaultKey;

    //Methods - Getters and Setters for each one of the attributes

    //supply
    public int getSupply() {
        return supply;
    }
    protected void setSupply(int supply) { //protected method as this might be only accessed by the price
        this.supply = supply;
    }

    //price
    public int getPrice() {
        return price;
    }
    protected void setPrice(int price) { //protected method as this might be only accessed by the supply
        this.price = price;
    }

    //address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //vaultKey
    private String getVaultKey() {
        return vaultKey;
    }
    private void setVaultKey(String vaultKey) {
        this.vaultKey = vaultKey;
    }
}
