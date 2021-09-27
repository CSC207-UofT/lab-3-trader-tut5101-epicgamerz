public class Basketball implements Tradable, Domesticatable{
    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String sound() {
        return "Bounce Bounce";
    }
}
