package org.example._20240922_state_pattern.trafficlight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = TrafficLight.createStartWithGreen();

        trafficLight.speak();
        trafficLight.changeLight();
        trafficLight.speak();
        trafficLight.changeLight();
        trafficLight.speak();
        trafficLight.changeLight();
        trafficLight.speak();
        trafficLight.changeLight();
        trafficLight.speak();
        trafficLight.changeLight();
        trafficLight.speak();
    }
}
