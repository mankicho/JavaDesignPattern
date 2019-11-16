import java.util.Calendar;

/**
 * 스케줄링 전략에 따라 객체 생성을 다르게한다.
 */
public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler scheduler = null;

        switch (strategyID) {
            case RESPONSE_TIME:
                scheduler = new ResponseTimeScheduler();
                break;
            case THROUGHPUT:
                scheduler = new ThroughputScheduler();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    scheduler = new ResponseTimeScheduler();
                } else {
                    scheduler = new ThroughputScheduler();
                }
                break;
        }

        return scheduler;
    }
}
