package org.example._20240922_state_pattern.door;

public class Door {
    private State state;

    private Door(State state) {
        this.state = state;
    }

    public static Door startWithOpen() {
        return new Door(new OpenState());
    }

    public void setState(State state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }
}
