package pl.lotto;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    public void should_return_user_won_when_user_gave_six_correct_numbers_and_random_generator_generated_same_numbers() {
        // given
        Set<Integer> numbersFromUser = Set.of(1, 2, 3, 4, 5, 6);
        NumberReceivable numberReceiver = new NumberReceiverTestImpl(numbersFromUser);
        LottoGame lottoGame = new LottoGame(numberReceiver);
        // when
        GameResult gameResult = lottoGame.playLotto();
        // then
        assertThat(gameResult.message).isEqualTo("user won");
    }

    @Test
    public void should_return_validation_error_when_user_gave_atleast_one_number_out_of_range() {
        // given
        Set<Integer> numbersFromUser = Set.of(100, 2, 3, 4, 5, 6);
        NumberReceivable numberReceiver = new NumberReceiverTestImpl(numbersFromUser);
        LottoGame lottoGame = new LottoGame(numberReceiver);
        // when
        GameResult gameResult = lottoGame.playLotto();
        // then
        assertThat(gameResult.message).isEqualTo("validation error");
    }

//    @Test
//    public void should_return_validation_error_when_user_gave_atleast_one_duplicated_number() {
//        // given
//        Coll<Integer> numbersFromUser = Set.of(1, 1, 3, 4, 5, 6);
//        NumberReceivable numberReceiver = new NumberReceiverTestImpl(numbersFromUser);
//        LottoGame lottoGame = new LottoGame(numberReceiver);
//        // when
//        GameResult gameResult = lottoGame.playLotto();
//        // then
//        assertThat(gameResult.message).isEqualTo("validation error");
//    }
}
