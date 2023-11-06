package homework_nr11;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создание 10 разных объектов типа Person
        Person person1 = new Person("John", "Doe", 30, true);
        Person person2 = new Person("Alice", "Smith", 35, true);
        Person person3 = new Person("Bob", "Adams", 40, true);
        Person person4 = new Person("Eve", "Brown", 28, true);
        Person person5 = new Person("Carol", "Anderson", 26, true);
        Person person6 = new Person("David", "Allen", 27, false);
        Person person7 = new Person("Grace", "Austen", 32, false);
        Person person8 = new Person("Frank", "Taylor", 37, true);
        Person person9 = new Person("Helen", "Moore", 29, true);
        Person person10 = new Person("Ivan", "Clark", 45, false);

        // Создание списка типа Person и добавление в него все созданные объекты Person
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);

        // С помощью Streams, отображение на экране до 5 уникальных сотрудников, которые старше 25 лет и получают почасовую оплату
        List<Person> result1 = personList.stream()
                .filter(person -> person.age > 25 && person.isPayedByHour)
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Сотрудники старше 25 лет и получают почасовую оплату:");
        result1.forEach(person -> System.out.println(person.name + " " + person.surname));

        // Создание еще одного списка типа Person и с помощью Streams добавление в него сотрудников старше 30 лет и фамилия которых начинается с 'A'
        List<Person> result2 = personList.stream()
                .filter(person -> person.age > 30 && person.surname.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("\nСотрудники старше 30 лет и фамилия начинается с 'A':");
        result2.forEach(person -> System.out.println(person.name + " " + person.surname));

        // С помощью Streams, поиск первого человека в списке в возрасте 37 лет
        Optional<Person> result3 = personList.stream()
                .filter(person -> person.age == 37)
                .findFirst();
        if (result3.isPresent()) {
            System.out.println("\nПервый человек в списке в возрасте 37 лет: " + result3.get().name + " " + result3.get().surname);
        } else {
            System.out.println("\nЧеловек в возрасте 37 лет не найден.");
        }
    }
}
