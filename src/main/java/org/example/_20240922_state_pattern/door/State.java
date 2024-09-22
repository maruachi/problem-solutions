package org.example._20240922_state_pattern.door;

public interface State {
    void open(Door door);

    void close(Door door);
}
