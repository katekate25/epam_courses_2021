package by.training.simplestapp.main.task01;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Введите третье число: ");
        double num3 = scanner.nextDouble();

        double [] arr = new double[3];
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;

        Arrays.sort(arr);
        double sum = arr[0] + arr[2];
        System.out.println(sum);
    }
}
