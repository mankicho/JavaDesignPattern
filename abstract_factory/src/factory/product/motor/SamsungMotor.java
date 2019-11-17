package factory.product.motor;


public class SamsungMotor extends Motor {

    @Override
    public void doMove() {
        System.out.println("삼성 모터를 가동시킴");
    }
}
