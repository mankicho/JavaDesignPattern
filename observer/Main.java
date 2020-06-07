package observer;

public class Main {

    public static void main(String[] args) {
        ScoreRecord record = new ScoreRecord();
        DataSheetView view3 = new DataSheetView(record, 3);
        DataSheetView view5 = new DataSheetView(record, 5);
        MinMaxView minMaxView = new MinMaxView(record);
        StatisticView statisticView = new StatisticView(record);

        // 3개 목록 DataSheetView 를 ScoreRecord 의 Observer 로 추가
        record.attach(view3);
        // 5개 목록을 Observer 로 추가
        record.attach(view5);
        // minMaxView 를 Observer 로 추가
        record.attach(minMaxView);
        // 통계 View 를 Observer 로 추가
        record.attach(statisticView);
        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("adding : " + score);
            record.addSocer(score);
        }
    }
}
