package by.training.simplestapp.main.task01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого катета: ");
        double a = scanner.nextInt();

        System.out.println("Введите длину второго катета: ");
        double b = scanner.nextInt();

        double square = a*b/2;
        System.out.println("Площадь треугольника: " + square);

        double hypot = Math.sqrt(a*a + b*b);
        double perimetr = a+b+hypot;
        System.out.println("Периметр треугольника: " + perimetr);

    }
}
