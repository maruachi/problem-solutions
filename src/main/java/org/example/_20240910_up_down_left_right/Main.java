package org.example._20240910_up_down_left_right;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("R", "R", "R", "U", "D", "D");

        Stream<Move> moves = input.stream().map(Move::of);
        GridMover gridMover = new GridMover(0, 0, 100, 100);
        moves.forEach(gridMover::move);

        System.out.println(gridMover);
    }
}
