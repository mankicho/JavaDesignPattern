package factory.product.door;

public class HyundaiDoor extends Door{
    @Override
    protected void doOpen() {
        System.out.println("현대 문을 열었음.");
    }

    @Override
    protected void doClose() {
        System.out.println("현대 문을 닫았음.");
    }
}
