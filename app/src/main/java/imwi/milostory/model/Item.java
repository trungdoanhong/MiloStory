package imwi.milostory.model;

/**
 * Created by linh on 11/18/2017.
 */

public class Item {

    private int image;
    private String name;


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(){

    }
    public Item(int image, String name) {
        this.image = image;
        this.name = name;
    }
}
