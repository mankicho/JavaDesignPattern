package command;

public class AlarmOnCommand implements Command{
    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start(); // 알람이 울리는 기능을 직접 호출하는것이 아닌 Command Interface 를 통해 호출
    }
}
