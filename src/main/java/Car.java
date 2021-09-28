public class Car implements Drivable, Tradable {

    private int price;
    static int maxSpeed; // flaw is here lol

    /**
     * 
     * @param price
     * @param speed
     */
    public Car(int price, int speed) {
        this.price = price;
        this.maxSpeed = speed;
    }
    public int getPrice() {
        return this.price;
    }

    public void upgradeSpeed() {
        // Increase speed by 10km/h
        this.maxSpeed += 10;
    }

    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
