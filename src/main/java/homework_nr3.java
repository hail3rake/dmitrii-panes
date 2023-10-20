public class homework_nr3 {
    public static void main(String[] args) {

        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;

            default:
                System.out.println("Некорректное число");
        }

        // Цикл для отображения чисел от 100 до 1000, делящихся на 5
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // Цикл для вычисления суммы серии
        double sum = 0;
        for (int i = 1; i <= 97; i += 2) {
            sum += (double) i / (i + 2);
        }
        System.out.println("Сумма серии: " + sum);
    }
}
