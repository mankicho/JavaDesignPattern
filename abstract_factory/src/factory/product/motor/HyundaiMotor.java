package factory.product.motor;

import factory.product.door.Door;

public class HyundaiMotor extends Motor {

    @Override
    public void doMove() {
        System.out.println("현대 모터를 가동시킴");
    }

}
