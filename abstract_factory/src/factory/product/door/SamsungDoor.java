package factory.product.door;

public class SamsungDoor extends Door {
    @Override
    protected void doOpen() {
        System.out.println("삼성 문을 열었음");
    }

    @Override
    protected void doClose() {
        System.out.println("삼성 문을 닫았음");
    }
}
