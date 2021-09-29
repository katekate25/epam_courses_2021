package by.training.simplestapp.main.task01;
import java.lang.Math;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите c: ");
        double c = scanner.nextDouble();

        double result = (b + Math.sqrt(b*b + 4*a*c))/2*a - a*a*a*c + 1/(b*b);
        System.out.println("начение выражения равно: " + result);


    }
}
