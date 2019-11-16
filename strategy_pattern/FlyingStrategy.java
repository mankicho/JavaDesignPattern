package strategy_pattern;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("i can fly");
    }
}
