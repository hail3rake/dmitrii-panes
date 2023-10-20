package homework_nr_12;
import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((number) -> number % 2 != 0),
    CHECK_IF_EVEN((number) -> number % 2 == 0),
    CHECK_IF_NEGATIVE((number) -> number < 0),
    CHECK_IF_POSITIVE((number) -> number > 0);

    private final Predicate<Integer> check;

    CheckInteger(Predicate<Integer> check) {
        this.check = check;
    }

    public boolean test(int number) {
        return check.test(number);
    }

    public static void main(String[] args) {
        // Вывод примеров с проверкой чисел
        int number1 = 7;
        int number2 = -5;

        System.out.println(number1 + " is odd: " + CheckInteger.CHECK_IF_ODD.test(number1));
        System.out.println(number2 + " is negative: " + CheckInteger.CHECK_IF_NEGATIVE.test(number2));
    }
}