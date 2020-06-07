package state;

public interface State {
    public void onButton(Light light);

    public void offButton(Light light);
}
