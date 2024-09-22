package org.example._20240922_state_pattern.trafficlight;

public class YellowLight implements State {
    @Override
    public void speak() {
        System.out.println("Yellow light 입니다.");
    }

    @Override
    public void changeLight(TrafficLight trafficLight) {
        trafficLight.setState(new RedLight());
    }
}
