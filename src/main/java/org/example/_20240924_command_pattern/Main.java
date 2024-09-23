package org.example._20240924_command_pattern;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.pressButton();

        TurnOnCommand turnOnCommand = new TurnOnCommand(Light.getInstance());
        TurnOffCommand turnOffCommand = new TurnOffCommand(Light.getInstance());

        remoteController.setCommand(turnOnCommand);
        remoteController.pressButton();

        remoteController.setCommand(turnOffCommand);
        remoteController.pressButton();
    }
}
