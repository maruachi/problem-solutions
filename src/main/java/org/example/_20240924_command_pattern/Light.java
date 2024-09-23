package org.example._20240924_command_pattern;

public class Light {
    private static final Light INSTANCE = new Light(false);
    private boolean state;

    private Light(boolean state) {
        this.state = state;
    }

    public static Light getInstance() {
        return INSTANCE;
    }

    public void turnOn() {
        System.out.println("turn on the light");
        this.state = true;
    }

    public void turnOff() {
        System.out.println("turn off the light");
        this.state = false;
    }
}
