package org.example._20240924_command_pattern;

//Invoker 역할
public class RemoteController {
    private Command command;

    public RemoteController() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (this.command != null) {
            this.command.execute();
        } else {
            System.out.println("No command");
        }

    }
}
