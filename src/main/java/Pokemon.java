public class Pokemon implements Tradable, Domesticatable{

    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    @Override
    public String sound() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
