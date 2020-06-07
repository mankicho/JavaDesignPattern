package observer;

import java.util.List;

public class StatisticView implements Observer {

    private ScoreRecord record;

    public StatisticView(ScoreRecord record) {
        this.record = record;
    }

    @Override
    public void update() {
        List<Integer> re = record.getList();
        displayView(re);
    }

    private void displayView(List<Integer> record) { // 추후에 템플릿 메서드를 통한 구현 가능
        int sum = 0;
        for (int i : record) {
            sum += i;
        }

        System.out.println("Sum = " + sum + " Avg = " + (sum / record.size()));
    }
}
