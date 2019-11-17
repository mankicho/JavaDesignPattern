package factory.product.door;

public abstract class Door {
    private DoorEnum doorEnum;

    public DoorEnum getDoorEnum() {
        return doorEnum;
    }

    public Door() {
        doorEnum = DoorEnum.OPEN;
    }

    public void setDoorEnum(DoorEnum doorEnum) {
        this.doorEnum = doorEnum;
    }

    public void open() {
        if (doorEnum == DoorEnum.OPEN) {
            return;
        }
        doOpen();
        setDoorEnum(DoorEnum.OPEN);
    }

    public void close() {
        if (doorEnum == DoorEnum.CLOSE) {
            return;
        }
        doClose();
        setDoorEnum(DoorEnum.CLOSE);
    }

    protected abstract void doOpen();

    protected abstract void doClose();
}
