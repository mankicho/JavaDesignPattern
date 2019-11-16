import com.sun.javafx.scene.traversal.Direction;

public class Main {
    public static void main(String[] args) {
        ElevatorManager responseTimeManager = new ElevatorManager(2,SchedulingStrategyID.RESPONSE_TIME);
        ElevatorManager throughputManager = new ElevatorManager(2,SchedulingStrategyID.THROUGHPUT);
        ElevatorManager dynamicManager = new ElevatorManager(2,SchedulingStrategyID.DYNAMIC);

        responseTimeManager.requestElevator(5,Direction.UP);
        throughputManager.requestElevator(3,Direction.DOWN);
        dynamicManager.requestElevator(4,Direction.LEFT);
    }
}
