public class Pants {

    //Attributes
    public int numberOfPockets;
    public int length;
    public String material;
    protected boolean zipperOpen; //This attribute is supposed to be protected as semantically only the pants' wearer can open their own zipper

    //Methods - Getters and Setters for each one of the attributes

    //numberOfPockets
    public int getNumberOfPockets() {
        return numberOfPockets;
    }
    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    //length
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    //material
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    //zipperOpen
    public boolean isZipperOpen() {
        return zipperOpen;
    }
    protected void setZipperOpen(boolean zipperOpen) {
        this.zipperOpen = zipperOpen;
    }
}
