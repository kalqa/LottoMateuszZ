package pl.games.lotto;

import java.util.List;

public class GetUserNumbersTestImpl implements GetUserNumbers {

    List<Integer> numbersFromUser;

    public GetUserNumbersTestImpl(List<Integer> numbersFromUser) {
        this.numbersFromUser = numbersFromUser;
    }

    @Override
    public List<Integer> getUserNumbers() {
        return numbersFromUser;
    }
}
