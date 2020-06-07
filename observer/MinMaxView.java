package observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer { // 데이터의 변화를 감시하는 Observer 객체
    private ScoreRecord record;

    public MinMaxView(ScoreRecord record) {
        this.record = record;
    }

    @Override
    public void update() {
        List<Integer> re = record.getList();
        displayMinMax(re);
    }

    private void displayMinMax(List<Integer> record) { // 추후에 템플릿 메서드를 통한 구현 가능
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);

        System.out.println("Min = " + min + " Max : " + max);
    }
}
