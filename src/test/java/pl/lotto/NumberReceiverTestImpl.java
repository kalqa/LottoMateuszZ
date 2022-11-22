package pl.lotto;

import java.util.Set;

public class NumberReceiverTestImpl implements NumberReceivable {

    Set<Integer> numbersFromUser;

    NumberReceiverTestImpl(Set<Integer> numbersFromUser) {
        this.numbersFromUser = numbersFromUser;
    }

    @Override
    public Set<Integer> receiveNumbersFromUser() {
        return numbersFromUser;
    }
}
