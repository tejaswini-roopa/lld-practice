import controllers.GameController;
import exceptions.InvalidGameParamsException;
import models.Game;
import models.Player;
import models.PlayerType;
import models.Bot;
import models.GameStatus;
import models.Symbol;
import models.BotDifficultyLevel;
import strategies.winningstrategies.OrderOneColumnWinningStrategy;
import strategies.winningstrategies.OrderOneDiagonalWinningStrategy;
import strategies.winningstrategies.OrderOneRowWinningStrategy;

void main() {
    // Create a game
    GameController gameController = new GameController();
    Scanner scanner = new Scanner(System.in);

    Game game;
    List<Player> players = List.of(
            new Player(new Symbol('X'), "Tejaswini", PlayerType.HUMAN),
            new Bot(new Symbol('O'), "Bot", BotDifficultyLevel.EASY)
    );
    int dimension = 3;

    try {
        game = gameController.createGame(
                dimension,
                players,
                List.of(
                        new OrderOneDiagonalWinningStrategy(players),
                        new OrderOneColumnWinningStrategy(dimension, players),
                        new OrderOneRowWinningStrategy(dimension, players)
                )
        );
    } catch (InvalidGameParamsException e) {
        System.out.println("Seems like you gave invalid params. Update those.");
        return;
    }

//        Game.Builder gameBuilder = new Game.Builder();
    System.out.println("-------------- Game is starting --------------");

    // while game status in progress
    while (gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)) {
        System.out.println("This is how board looks like:");
        // print board
        gameController.displayBoard(game);
        // print if undo
        System.out.println("Does anyone want to undo? (y/n)");
        // if yes -> call undo
        String input = scanner.next();

        if (input.equalsIgnoreCase("y")) {
            gameController.undo(game);
        } else {
            // move next player
            gameController.makeMove(game);
        }
    }
    // check status of game


    gameController.printResult(game);
    gameController.displayBoard(game);
    // else -> print draw
}
