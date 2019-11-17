package factory.corporation;

import factory.ElevatorFactory;
import factory.product.door.Door;
import factory.product.door.HyundaiDoor;
import factory.product.motor.HyundaiMotor;
import factory.product.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {

    private static HyundaiElevatorFactory hyundaiElevatorFactory;

    // 현대 부품을 제공하는 공장은 1개만있으면 되므로 싱글톤 패턴을 사용함.
    // 다중쓰레드에서 접근시 여러 객체가 생성될수 있으므로 동기화시켜서 방지.
    public synchronized static HyundaiElevatorFactory getInstance() {
        if (hyundaiElevatorFactory == null) {
            hyundaiElevatorFactory = new HyundaiElevatorFactory();
        }
        return hyundaiElevatorFactory;
    }

    private HyundaiElevatorFactory() {

    }

    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
