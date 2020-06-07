package state;

public class Off implements State {
    @Override
    public void onButton(Light light) {
        System.out.println("Light on!!");
    }

    @Override
    public void offButton(Light light) {
        System.out.println("...............");
    }
}
