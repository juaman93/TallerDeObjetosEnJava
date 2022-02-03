/**
 * Representa un pantalón y sus atributos.
 *
 *  @author Juan Manuel Montealegre
 */
public class Pants {

    //Atributos

    /**
     * Representa el número de bolsillos del pantalón.
     */
    public int numberOfPockets;
    /**
     * Representa la longitud del pantalón.
     */
    public int length;
    /**
     * Representa el material con el cual está hecho el pantalón.
     */
    public String material;
    /**
     * Representa si el pantalón tiene el cierre abierto o no. Es protegido ya que no cualquiera puede llegar y abrir el cierre del pantalón de alguien.
     */
    protected boolean zipperOpen; //This attribute is supposed to be protected as semantically only the pants' wearer can open their own zipper

    //Métodos

    /**
     *
     * @return Devuelve el número de bolsillos del pantalón.
     */
    public int getNumberOfPockets() {
        return numberOfPockets;
    }

    /**
     *
     * @param numberOfPockets Asigna el número de bolsillos del pantalón.
     */
    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    /**
     *
     * @return Devuelve el largo del pantalón.
     */
    public int getLength() {
        return length;
    }

    /**
     *
     * @param length Asigna el largo del pantalón.
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     *
     * @return Devuelve el material con el cual está hecho el pantalón.
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @param material Asigna el material con el cual está hecho el pantalón.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     *
     * @return Devuelve si el pantalón tiene el cierre abierto o no.
     */
    public boolean isZipperOpen() {
        return zipperOpen;
    }

    /**
     *
     * @param zipperOpen Asigna si el pantalón tiene el cierre abierto o no. Método protegido ya que no cualquiera puede llegar y abrir el cierre del pantalón de alguien.
     */
    protected void setZipperOpen(boolean zipperOpen) {
        this.zipperOpen = zipperOpen;
    }
}
