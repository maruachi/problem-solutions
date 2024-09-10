package org.example._20240910_up_down_left_right;

import java.util.Arrays;
import java.util.Optional;

public enum Move {
    UP("L", -1, 0),DOWN("R", 1, 0),
    LEFT("U", 0, 1),RIGHT("D", 0,-1);
    private final String value;
    private final int xGridMove;
    private final int yGridMove;

    Move(String value, int xGridMove, int yGridMove) {
        this.value = value;
        this.xGridMove = xGridMove;
        this.yGridMove = yGridMove;
    }

    public static Move of(String value) {
        Optional<Move> first = Arrays.stream(Move.values()).filter(move -> move.getValue().equals(value)).findFirst();
        return first.orElseThrow(RuntimeException::new);
    }

    public int getXGridMove() {
        return xGridMove;
    }

    public int getYGridMove() {
        return yGridMove;
    }

    public String getValue() {
        return value;
    }
}
