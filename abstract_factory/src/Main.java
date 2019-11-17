import com.sun.javafx.scene.traversal.Direction;
import factory.ElevatorFactory;
import factory.corporation.HyundaiElevatorFactory;
import factory.corporation.LGElevatorFactory;
import factory.corporation.SamSungElevatorFactory;
import factory.product.door.Door;
import factory.product.motor.Motor;

// 팩토리 매서드는 새로운 부품이 생겼을때 계속 부품의 팩토리를 생성해줘야한다는 문제가있다.
// 부품마다 factory를 생성하는것이아닌, 기업별 factory를 만들어서 코드가 길어지는것을 방지한다.
public class Main {
    public static void main(String[] args) {
        ElevatorFactory lgFactory = LGElevatorFactory.getInstance();
        ElevatorFactory samsungFactory = SamSungElevatorFactory.getInstance();
        ElevatorFactory hyundaiFactory = HyundaiElevatorFactory.getInstance();

        Motor motor = lgFactory.createMotor();
        Door door = hyundaiFactory.createDoor();

        motor.setDoor(door);
        door.close();
        motor.move();

        System.out.println();
        System.out.println("모터를 삼성것으로 바꿈");

        Motor samsungMotor = samsungFactory.createMotor();
        samsungMotor.setDoor(door);

        samsungMotor.move();
    }
}
