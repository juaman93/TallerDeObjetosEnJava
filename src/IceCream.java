/**
 * Representa un helado y sus atributos.
 *
 *  @author Juan Manuel Montealegre
 */
public class IceCream {

    //Atributos

    /**
     * Representa el sabor del helado.
     */
    public String flavor;
    /**
     * Representa el tipo de cono del helado.
     */
    public String cone;
    /**
     * Representa el topping del helado.
     */
    public boolean withTopping;

    //Métodos

    /**
     *
     * @return Devuelve el sabor del helado.
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     *
     * @param flavor Asigna el sabor del helado.
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     *
     * @return Devuelve el tipo de cono del helado.
     */
    public String getCone() {
        return cone;
    }

    /**
     *
     * @param cone Asigna el tipo de cono del helado.
     */
    public void setCone(String cone) {
        this.cone = cone;
    }

    /**
     *
     * @return Devuelve el topping del helado.
     */
    //withTopping
    public boolean isWithTopping() {
        return withTopping;
    }

    /**
     *
     * @param withTopping Asigna el topping del helado.
     */
    public void setWithTopping(boolean withTopping) {
        this.withTopping = withTopping;
    }
}
