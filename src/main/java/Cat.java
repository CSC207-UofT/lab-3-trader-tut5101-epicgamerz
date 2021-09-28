/**
 * A class representing cats.
 * 
 */
public class Cat implements Domesticatable, Tradable {
    private String color;

    /**
     * 
     * @param color
     */
    public Cat(String color) {
        this.color = color;
    }

    @Override
    public String sound() {
        return "Nyaa~";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Color: " + this.color + ")";
    }
}
