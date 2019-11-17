package factory;

import factory.product.door.Door;
import factory.product.motor.Motor;

// factory 에서 필요한 기능만 추상화.
public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
