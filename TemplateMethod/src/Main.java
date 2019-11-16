import com.sun.javafx.scene.traversal.Direction;
import door.Door;
import motor.HyundaiMotor;
import motor.LGMotor;
import status.DoorStatus;
import status.MotorStatus;

// 2개 이상의 클래스가 유사기능을 제공하면서 중복된 코드가 있는경우 상속을 이용해서 코드중복을 피할 수 있다.
// 현대모터와 LG모터의 상위 클래스로 Motor 클래스 정의. 모터 클래스에 중복되는 기능 정의
public class Main {
    public static void main(String[] args) {
        HyundaiMotor hyundaiMotor = new HyundaiMotor(new Door(DoorStatus.OPENED), MotorStatus.STOPPED);
        LGMotor lgMotor = new LGMotor(new Door(DoorStatus.OPENED),MotorStatus.STOPPED);

        hyundaiMotor.move(Direction.UP);
        lgMotor.move(Direction.DOWN);
    }
}
