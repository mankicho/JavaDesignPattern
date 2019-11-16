package motor;

import com.sun.javafx.scene.traversal.Direction;
import door.Door;
import status.DoorStatus;
import status.MotorStatus;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door, MotorStatus motorStatus) {
        this.door = door;
        this.motorStatus = motorStatus;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    /**
     * 현대와 LG가 move 메서드가 겹치기때문에 상위클래스인 모터 클래스에서
     * 겹치는 부분을 매소드로 작성하고 다른부분만 오버라이드 할수있게 코드를 작성한다.
     * @param direction
     */
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveMotor(direction);
        setMotorStatus(motorStatus);

    }

    protected abstract void moveMotor(Direction direction);
}
