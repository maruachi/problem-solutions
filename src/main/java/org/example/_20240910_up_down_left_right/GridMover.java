package org.example._20240910_up_down_left_right;

public class GridMover{
    private int x = 0;
    private int y = 0;

    private final int xMinBound;
    private final int yMinBound;
    private final int xMaxBound;
    private final int yMaxBound;

    public GridMover(int xMinBound, int yMinBound, int xMaxBound, int yMaxBound) {
        this.xMinBound = xMinBound;
        this.yMinBound = yMinBound;
        this.xMaxBound = xMaxBound;
        this.yMaxBound = yMaxBound;
    }

    public void setStartPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Move move) {
        move(move.getXGridMove(), move.getYGridMove());
    }

    private void move(int xGridMove, int yGridMove) {
        int xMoved = x + xGridMove;
        int yMoved = y + yGridMove;
        if (xMoved < xMinBound || xMoved > xMaxBound || yMoved < yMinBound || yMoved > yMaxBound) {
            return;
        }

        x = xMoved;
        y = yMoved;
    }

    @Override
    public String toString() {
        return "GridMover{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
