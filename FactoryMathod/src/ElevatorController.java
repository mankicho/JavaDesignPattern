public class ElevatorController {
    private int id; // 엘레베이터 id
    private int curFloor; // 현재 층

    public ElevatorController(int id) {
        this.id = id;
        this.curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.print("Elevator " + id + " Floor : " + curFloor);
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}
