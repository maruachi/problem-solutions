package org.example._20240922_state_pattern.trafficlight;

public interface State {
    void speak();
    void changeLight(TrafficLight trafficLight);
}
