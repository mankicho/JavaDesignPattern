package state;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        light.onButtonPushed();
        light.offButtonPushed();
        light.setState(new Reserve());
        light.onButtonPushed();
        light.offButtonPushed();
    }
}
