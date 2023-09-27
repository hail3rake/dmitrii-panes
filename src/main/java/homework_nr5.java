public class homework_nr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        // Заполнение массива  числами от 100 до 0
        for (int i = 0; i < 100; i++) {
            numbers[i] = 100 - i;
        }


        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Определение суммы четных элементов и произведения нечетных элементов
        int sumOfEvens = 0;
        int productOfOdds = 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            } else {
                productOfOdds *= number;
            }
        }

        System.out.println("Сумма четных элементов: " + sumOfEvens);
        System.out.println("Произведение нечетных элементов: " + productOfOdds);

        // Создание массива copyNumbers и копирование элементов из массива numbers
        int[] copyNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
    }
}
