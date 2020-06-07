package command;

public class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn(); // 램프가 켜지는 기능을 직접 호출하는것이 아닌 Command Interface 를 통해 호출
    }
}
