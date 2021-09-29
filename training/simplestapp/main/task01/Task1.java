package by.training.simplestapp.main.task01;
import java.util.Scanner;

//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        char [] numToArray = Integer.toString(num).toCharArray();
        if (numToArray[0]+numToArray[1]==numToArray[2]+numToArray[3])
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

}
