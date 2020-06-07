package command;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();

        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);
        Button button = new Button(lampOnCommand);
        button.pressed();
        button.setCommand(alarmOnCommand);
        button.pressed();

        // Button 을 클릭했을때 다른 기능을 수행하고싶다면 Command 를 implement 하는 다른 명령클래스를 만
    }
}
