package state;

public class Light {
    private State state;

    public Light() {
        state = new Off();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void onButtonPushed(){
        state.onButton(this);
    }

    public void offButtonPushed(){
        state.offButton(this);
    }
}
