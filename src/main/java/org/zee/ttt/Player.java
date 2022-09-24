package org.zee.ttt;

import java.util.Scanner;

public class Player {
    private final Value value;
    private final Scanner nextMove;

    public Player(Value value, Scanner nextMove) {
        this.value = value;
        this.nextMove = nextMove;
    }

    public Cell makeMove(Value[][] grid) {
        int moveAsInt = getNextMove().nextInt();
        return new Cell(moveAsInt / 10, moveAsInt % 10);
    }

    public Scanner getNextMove() {
        return nextMove;
    }

    public Value getValue() {
        return value;
    }
}
