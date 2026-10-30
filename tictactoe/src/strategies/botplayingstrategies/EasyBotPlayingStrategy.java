package strategies.botplayingstrategies;

import models.Board;
import models.Cell;
import models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Cell makeMove(Board board) {

        for(List<Cell> row : board.getBoard()) {
            for(Cell cell : row) {
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return cell;
                }
            }
        }

        return null; // You should never come here
    }
}
