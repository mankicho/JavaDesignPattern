package factory.product.door;

public class LGDoor extends Door{
    @Override
    protected void doOpen() {
        System.out.println("LG 문을 열었음");
    }

    @Override
    protected void doClose() {
        System.out.println("LG 문을 닫았음.");
    }
}
