public class Pokemon implements Tradable, Domesticatable, Drivable{

    private String name;
    private int maxspeed;

    public Pokemon() {
        this.name = "Pikachu";
        this.maxspeed = 5;
    }

    public Pokemon(String name) {
        this.name = name;
        this.maxspeed = 5;
    }

    public String sound() {
        return this.name + "!";
    }

    @Override
    public int getPrice() {
        return this.name.length() * 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed -= 3;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }
}
