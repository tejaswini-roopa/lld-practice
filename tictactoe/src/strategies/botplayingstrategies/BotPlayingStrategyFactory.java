package strategies.botplayingstrategies;

import models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        return new EasyBotPlayingStrategy();
//        return switch (difficultyLevel){
//            case EASY -> new EasyBotPlayingStrategy();
//            case MEDIUM -> new MediumBotPlayingStrategy();
//            case HARD ->  new HardBotPlayingStrategy();
//        };
    }
}
