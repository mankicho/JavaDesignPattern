package motor;

import com.sun.javafx.scene.traversal.Direction;
import door.Door;
import status.DoorStatus;
import status.MotorStatus;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door, MotorStatus motorStatus) {
        super(door, motorStatus);
    }

    /**
     * move 메소드는 현대와 LG가 겹치기때문에 상위 클래스인 Motor로 옮기고 하위클래스에서 오버라이드 하는 방식으로 중복을 최소화한다.
     */
//    public void move(Direction direction) {
//        MotorStatus motorStatus = getMotorStatus();
//
//        if (motorStatus == MotorStatus.MOVING) {
//            return;
//        }
//
//        //문이 닫혀있어야 모터를움직일수있음.
//        DoorStatus doorStatus = door.getDoorStatus();
//        if (doorStatus == DoorStatus.OPENED) {
//            door.close();
//        }
//
//        moveHyundaiMotor(direction);
//        setMotorStatus(MotorStatus.MOVING);
//    }


    // 무브 매서드가 겹치기때문에 상위 클래스인 모터클래스에서 겹치는 부분을 정의하고 다른부분만 오버라이드해서 코드중복 최소화
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("현대 모터를"+ direction + " 방향으로 구동시킴.");
    }
}
