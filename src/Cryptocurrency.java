/**
 * Representa una criptomoneda y alguno de sus atributos de mercado y protocolo.
 *
 *  @author Juan Manuel Montealegre
 */
public class Cryptocurrency {

    //Atributos

    /**
     * Representa la oferta de la criptomoneda.
     */
    public int supply;
    /**
     * Representa el precio de mercado.
     */
    public int price;
    /**
     * Representa la dirección del contrato de la criptomoneda.
     */
    public String contractAddress;

    //Métodos

    /**
     *
     * @return Devuelve la cantidad de oferta de la criptomoneda.
     */
    public int getSupply() {
        return supply;
    }

    /**
     *
     * @param supply Asigna la cantidad de oferta de la criptomoneda.
     *               Método protegido, ya que este normalmente solo puede ser accedido por otros métodos de cálculo de demanda del mercado.
     */
    protected void setSupply(int supply) { //protected method as this might be only accessed by the market demand calculations
        this.supply = supply;
    }

    /**
     *
     * @return Devuelve el precio de la criptomoneda.
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @param price Asigna el precio de la criptomoneda.
     *              Método protegido, ya que este normalmente solo puede ser accedido por otros métodos de cálculo de demanda del mercado.
     */
    protected void setPrice(int price) { //protected method as this might be only accessed by the market demand calculations
        this.price = price;
    }

    /**
     *
     * @return Devuelve la dirección del contrato de la criptomoneda.
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     *
     * @param address Asigna la dirección del contrato de la criptomoneda.
     *                Método privado, ya que este normalmente solo puede ser accedido por otros métodos de protocolo de la blockchain o por los mismos desarrolladores.
     */
    private void setContractAddress(String address) {
        this.contractAddress = address;
    }
}
