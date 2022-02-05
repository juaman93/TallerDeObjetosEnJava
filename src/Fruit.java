import java.util.ArrayList;

/**
 * Representa una fruta y algunos de sus atributos.
 *
 *  @author Juan Manuel Montealegre
 */
public class Fruit {

    //Atributos

    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio.
     */
    private float averageWeight;
    /**
     * Represental a cantidad de colores de la lista de colores.
     */
    public int colorQuantity;
    /**
     * Representa los diferentes colores que puede llegar a tener una fruta.
     */
    public ArrayList<String> colors = new ArrayList<String>(colorQuantity);

    //Métodos

    /**
     *
     * @return Devuelve el nombre de la fruta.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Asigna el nombre de la fruta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Devuelve el peso promedio de la fruta.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     *
     * @param averageWeight Asigna el peso promedio de la fruta.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     *
     * @return Devuelve la lista de los diferentes colores que puede llegar a tener una fruta.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     *
     * @param colors Asigna los los diferentes colores que puede llegar a tener una fruta.
     */
    public void setColors(ArrayList<String> colors) {
        colors.add("color de fruta");
    }
}
