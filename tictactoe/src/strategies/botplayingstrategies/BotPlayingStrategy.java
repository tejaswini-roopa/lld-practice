package strategies.botplayingstrategies;

import models.Board;
import models.Cell;
import models.Move;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
