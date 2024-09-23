package org.example._20240924_command_pattern;

public class TurnOffCommand implements Command{
    private final Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
