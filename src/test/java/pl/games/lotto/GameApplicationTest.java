package pl.games.lotto;

import org.junit.jupiter.api.Test;
import pl.games.GameResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameApplicationTest {

    @Test
    public void should_return_success_when_user_gave_six_numbers() {
        // given
        GetUserNumbersTestImpl userInput = new GetUserNumbersTestImpl(List.of(1, 2, 3, 6, 9, 10));
        LottoGame lottoGame = new LottoGame(userInput);
        List<Integer> userNumbers = List.of(1, 2, 3, 4, 5, 6);
        // when
        GameResult gameResult = lottoGame.play();
        // then
        assertThat(gameResult.getMessage()).isEqualTo("you won");
        assertThat(gameResult.isWon()).isEqualTo(true);
    }
}
