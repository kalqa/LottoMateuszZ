package pl.games.lotto;

import java.util.List;
import org.junit.jupiter.api.Test;
import pl.games.GameResult;
import static org.assertj.core.api.Assertions.assertThat;

public class GameApplicationTest {

    @Test
    public void should_return_success_when_user_gave_six_numbers() {
        // given
        List<Integer> userNumbers = List.of(1, 2, 3, 6, 9, 10);
        GetUserNumbers numbersFromUser = new GetUserNumbersTestImpl(userNumbers);
        LottoGame lottoGame = new LottoGame(numbersFromUser);

        // when
        GameResult gameResult = lottoGame.play();

        // then
        assertThat(gameResult.getMessage()).isEqualTo("you won");
        assertThat(gameResult.isWon()).isEqualTo(true);
    }

    //
    @Test
    public void should_return_failed_when_user_gave_less_than_six_numbers() {
        // given
        List<Integer> userNumbers = List.of(1, 4, 7, 89, 11);
        GetUserNumbers numbersFromUsers = new GetUserNumbersTestImpl(userNumbers);
        LottoGame lottoGame = new LottoGame(numbersFromUsers);
        // when
        GameResult gameResult = lottoGame.play();
        // then
        assertThat(gameResult.getMessage()).isEqualTo("you gave less than six numbers");
        assertThat(gameResult.isWon()).isEqualTo(false);
    }

    @Test
    public void should_return_failed_when_user_gave_more_than_six_numbers() {
        // given
        List<Integer> userNumbers = List.of(1, 4, 7, 89, 11, 12, 14);
        GetUserNumbers numbersFromUsers = new GetUserNumbersTestImpl(userNumbers);
        LottoGame lottoGame = new LottoGame(numbersFromUsers);

        // when
        GameResult gameResult = lottoGame.play();
        // then
        assertThat(gameResult.getMessage()).isEqualTo("you gave more than six numbers");
        assertThat(gameResult.isWon()).isEqualTo(false);
    }
//
//    @Test
//    public void should_return_failed_when_user_gave_at_least_one_duplicated_number() {
//        // given
//        LottoGame lottoGame = new LottoGame();
//        // when
//        GameResult gameResult = lottoGame.play();
//        // then
//        assertThat(gameResult.getMessage()).isEqualTo("you duplicated numbers");
//        assertThat(gameResult.isWon()).isEqualTo(false);
//    }
//
//    @Test
//    public void should_return_failed_when_user_gave_at_least_one_number_out_of_range() {
//        // given
//        LottoGame lottoGame = new LottoGame();
//        // when
//        GameResult gameResult = lottoGame.play();
//        // then
//        assertThat(gameResult.getMessage()).isEqualTo("number is out of range");
//        assertThat(gameResult.isWon()).isEqualTo(false);
//    }

}
