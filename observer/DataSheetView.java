package observer;

import java.util.List;

public class DataSheetView implements Observer { // 데이터의 변화를 감시하는 Observer 객체

    private ScoreRecord record;
    private int viewCount;

    public DataSheetView(ScoreRecord record, int viewCount) {
        this.record = record;
        this.viewCount = viewCount;
    }

    @Override
    public void update() {
        List<Integer> re = record.getList();
        displayScores(re, viewCount);
    }

    private void displayScores(List<Integer> record, int viewCount) { // 추후에 템플릿 메서드를 통한 구현 가능
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }
}
