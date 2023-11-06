package homework_nr15;

import java.util.HashSet;
import java.util.TreeSet;

public class CarSortingExample {
    public static void main(String[] args) {
        // Создаем HashSet автомобилей
        HashSet<Car> carHashSet = new HashSet<>();
        carHashSet.add(new Car(2022, "Toyota"));
        carHashSet.add(new Car(2019, "Honda"));
        carHashSet.add(new Car(2020, "Ford"));

        // Создаем TreeSet автомобилей для сортировки
        TreeSet<Car> carTreeSet = new TreeSet<>(carHashSet);

        // Выводим содержимое HashSet
        System.out.println("HashSet:");
        for (Car car : carHashSet) {
            System.out.println(car);
        }

        // Выводим содержимое TreeSet (уже отсортирован в убывающем порядке)
        System.out.println("\nTreeSet (sorted in descending order by year made):");
        for (Car car : carTreeSet) {
            System.out.println(car);
        }
    }
}