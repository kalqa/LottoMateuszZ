package pl.games;

public class GameResult {

    String message;
    boolean won;

    public GameResult(String message, boolean won) {
        this.message = message;
        this.won = won;
    }

    public String getMessage() {
        return message;
    }

    public boolean isWon() {
        return won;
    }
}
