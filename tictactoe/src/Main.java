import controllers.GameController;
import models.*;
import strategies.winningstrategies.OrderOneColumnWinningStrategy;
import strategies.winningstrategies.OrderOneDiagonalWinningStrategy;
import strategies.winningstrategies.OrderOneRowWinningStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    GameController gameController = new GameController();
    Scanner scanner = new Scanner(System.in);

    Game game ;

    try{
        game = gameController.createGame(
                3,List.of(
                        new Player(new Symbol('X'), "Naman", PlayerType.HUMAN),
                        new Bot(new Symbol('X'),"aman",BotDifficultyLevel.EASY)
                ),
                List.of(
                        new OrderOneDiagonalWinningStrategy(),
                        new OrderOneColumnWinningStrategy(),
                        new OrderOneRowWinningStrategy()
                )
        );
    }catch(Exception e)
    {
        System.out.println("Something went wrong");
        return;
    }

    while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)) {
        gameController.displayBoard(game);

        String input = scanner.next();

        if (input.equalsIgnoreCase("y")) {
            gameController.undo(game);
        } else {
            gameController.makeMove(game);
        }
    }

    gameController.printResult(game);
}
