package homework_nr15;

import java.util.*;

class Car implements Comparable<Car> {
    private int yearMade;
    private String name;

    public Car(int yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }

    public int getYearMade() {
        return yearMade;
    }

    @Override
    public int compareTo(Car otherCar) {
        // Сортируем в убывающем порядке по году выпуска
        return Integer.compare(otherCar.yearMade, this.yearMade);
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }
}