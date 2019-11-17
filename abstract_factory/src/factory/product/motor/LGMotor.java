package factory.product.motor;


public class LGMotor extends Motor {

    @Override
    public void doMove() {
        System.out.println("LG 모터를 가동시킴");
    }
}
