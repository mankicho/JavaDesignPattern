package state;

public class Reserve implements State{
    @Override
    public void onButton(Light light) {
        System.out.println("예약 완료되었습니다/");
    }

    @Override
    public void offButton(Light light) {
        System.out.println("예약이 취소되었습니다");
    }
}
