package door;

import status.DoorStatus;

public class Door {
    protected DoorStatus doorStatus;

    public Door(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void close(){
        doorStatus = DoorStatus.CLOSED;
    }

    public void open(){
        doorStatus = DoorStatus.OPENED;
    }
}
