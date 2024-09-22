package org.example._20240922_state_pattern.door;

public class Main {
    public static void main(String[] args) {
        Door door = Door.startWithOpen();
        door.open();
        door.close();
        door.close();
        door.open();
        door.close();
    }
}
