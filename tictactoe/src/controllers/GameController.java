package controllers;

import models.Cell;
import models.Game;
import models.GameStatus;
import models.Player;
import strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {

        public Game createGame(int dimension, List<Player> players,
                               List<WinningStrategy> winningStrategies){

           return Game.getBuilder()
                   .setDimension(dimension)
                   .setPlayers(players)
                   .setWinningStrategies(winningStrategies)
                   .build() ;
        }

        public void displayBoard(Game game){
               game.printBoard();
        }

        public void undo(Game game){

        }

        public void makeMove(Game game){

        }

        public GameStatus getGameStatus(Game game){
            return game.getGameStatus();
        }

        public void printResult(Game game){
                game.printResult();
        }
}
