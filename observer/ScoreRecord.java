package observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject { // 데이터

    private List<Integer> list = new ArrayList<>();

    public void addSocer(int score) {
        list.add(score);

        notifyAllObserver(); // 리스트에 데이터가 추가되면 모든 Observer 에게 통보된다.
    }

    public List<Integer> getList() {
        return list;
    }
}
