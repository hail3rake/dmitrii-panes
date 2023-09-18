package org.example.homeworknr4;

public class homework_nr4 {
    public static void main(String[] args) {
        // Код для класса Circle
        double radius = 5.0; //
        Circle circle = new Circle(radius);
        circle.calculateArea();

        // Код для класса TemperatureConverter
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 68.0;
        double celsius = converter.toCelsius(fahrenheit);
        System.out.println(fahrenheit + " градусов Фаренгейта = " + celsius + " градусов Цельсия");

        celsius = 20.0;
        fahrenheit = converter.toFahrenheit(celsius);
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + area);
    }
}

class TemperatureConverter {
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}

