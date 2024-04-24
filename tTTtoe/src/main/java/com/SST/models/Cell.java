package com.SST.models;
class Cell {
    private int row;
    private int column;
    private Player player;
    private CellState state;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.state = CellState.EMPTY;
        this.player = null;
    }
}