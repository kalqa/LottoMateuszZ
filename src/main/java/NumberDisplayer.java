import java.util.List;

public class NumberDisplayer {
    public void displayUserNumber(List<Integer> userNumbers) {
        System.out.println("Your numbers are:");
        for (int number : userNumbers) {
            System.out.print(number + " ");
        }
    }
}
