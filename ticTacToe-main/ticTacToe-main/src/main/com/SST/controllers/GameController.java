package com.SST.controllers;

import com.SST.models.Game;
import com.SST.models.GameState;
import com.SST.models.Player;
import com.SST.models.Symbol;
import com.SST.exceptions.SameSymbolException;
import com.SST.exceptions.InvalidMoveException;

import java.util.HashSet;
import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        HashSet<Symbol> set = new HashSet<>();
        for(int i=0; i<players.size(); i++) {
            set.add(players.get(i).getSymbol());
        }
        if(set.size()!=players.size())
            throw new SameSymbolException("Some players have taken the same symbol, please take unique symbols!");
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
