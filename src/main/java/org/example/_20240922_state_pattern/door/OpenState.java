package org.example._20240922_state_pattern.door;

public class OpenState implements State{
    @Override
    public void open(Door door) {
        System.out.println("문이 이미 열려있습니다.");
    }

    @Override
    public void close(Door door) {
        System.out.println("문을 닫았습니다.");
        door.setState(new CloseState());
    }
}
