package by.training.simplestapp.main.task01;
import java.util.Scanner;


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
