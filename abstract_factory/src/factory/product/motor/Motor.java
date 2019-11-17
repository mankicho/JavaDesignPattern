package factory.product.motor;

import com.sun.javafx.scene.traversal.Direction;
import factory.product.door.Door;
import factory.product.door.DoorEnum;

public abstract class Motor {

    private MotorEnum motorEnum;
    private Door door;

    public MotorEnum getMotorEnum() {
        return motorEnum;
    }

    public void setMotorEnum(MotorEnum motorEnum) {
        this.motorEnum = motorEnum;
    }

    public void move() {
        if (motorEnum == MotorEnum.MOVING) {
            return;
        }

        if (door.getDoorEnum() == DoorEnum.OPEN) {
            door.setDoorEnum(DoorEnum.CLOSE);
        }
        doMove();
        setMotorEnum(MotorEnum.MOVING);
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    protected abstract void doMove();
}
