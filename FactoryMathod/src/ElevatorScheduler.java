import com.sun.javafx.scene.traversal.Direction;

public interface ElevatorScheduler {

    int selectElevator(ElevatorManager manager, int destination, Direction direction);

}
