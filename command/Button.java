package command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressed(){
        command.execute(); // 버튼이 눌리면 설정된 명령을 실행한다.
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
