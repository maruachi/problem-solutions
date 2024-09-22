package org.example._20240922_state_pattern.trafficlight;

public class TrafficLight {
    private State state;

    private TrafficLight(State state) {
        this.state = state;
    }

    public static TrafficLight createStartWithGreen() {
        GreenLight greenLight = new GreenLight();
        return new TrafficLight(greenLight);
    }

    public void speak() {
        state.speak();
    }

    public void changeLight() {
        state.changeLight(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
