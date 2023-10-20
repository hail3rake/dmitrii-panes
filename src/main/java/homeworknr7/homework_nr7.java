package homeworknr7;

abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void work();
}

class Manager extends Person {
    public Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing.");
    }
}

class Developer extends Person {
    public Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is developing.");
    }
}

public class homework_nr7 {
    public static void main(String[] args) {
        // Создаем объекты неабстрактных классов
        Manager manager1 = new Manager("Manager 1");
        Manager manager2 = new Manager("Manager 2");
        Developer developer1 = new Developer("Developer 1");
        Developer developer2 = new Developer("Developer 2");


        manager1.work();
        manager2.work();
        developer1.work();
        developer2.work();

        // Создаем массив типа Person и добавляем в него все созданные объекты
        Person[] people = {manager1, manager2, developer1, developer2};

        // Используя instanceof, фильтруем Manager и вызываем метод work()
        for (Person person : people) {
            if (person instanceof Manager) {
                ((Manager) person).work();
            }
        }
    }
}