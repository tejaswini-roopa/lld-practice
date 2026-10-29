package strategies.winningstrategies;

import models.Board;
import models.Move;

public class OrderOneColumnWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
