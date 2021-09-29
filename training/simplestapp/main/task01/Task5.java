package by.training.simplestapp.main.task01;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        method(num1);

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        method(num2);

        System.out.println("Введите третье число: ");
        double num3 = scanner.nextDouble();
        method(num3);
    }

    private static void method (double x){
        if (x>=0)
        {
            System.out.println(x*x);
        }
        else
        {
            System.out.println(x*x*x*x);
        }
    }
}
