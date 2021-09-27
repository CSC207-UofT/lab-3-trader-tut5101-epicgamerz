public class Gamer implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;
    public Gamer() {
        this.maxSpeed = 2;
    }
    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }
    @Override
    public void upgradeSpeed() { this.maxSpeed++; }
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    @Override
    public String sound() {
        return "Fortnite!";
    }
    @Override
    public int getPrice() {
        return 1;
    }
}
