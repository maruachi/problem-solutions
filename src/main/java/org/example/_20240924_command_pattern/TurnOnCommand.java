package org.example._20240924_command_pattern;

public class TurnOnCommand implements Command{
    private final Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
