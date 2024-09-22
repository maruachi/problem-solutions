package org.example._20240922_state_pattern.door;

public class CloseState implements State {
    @Override
    public void open(Door door) {
        System.out.println("문을 열었습니다.");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("문이 이미 닫혀있습니다.");
    }
}
