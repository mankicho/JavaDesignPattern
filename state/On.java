package state;

public class On implements State{
    @Override
    public void onButton(Light light) {
        System.out.println(".............");
    }

    @Override
    public void offButton(Light light) {
        System.out.println("Light OFF");
    }
}
