import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    // 주어진 수 만큼의 ElevatorController를 생성한다.
    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        this.strategyID = strategyID;
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        int selectedElevator = scheduler.selectElevator(this,destination,direction);
        System.out.println(scheduler.getClass().getName());
        controllers.get(selectedElevator).gotoFloor(destination);
    }

    // setScheduler를 사용하는 방식은 strategy pattern에 해당.
    // 인터페이스를 구현하는 방식
//    public void setScheduler(ElevatorScheduler scheduler) {
//        this.scheduler = scheduler;
//    }
}
