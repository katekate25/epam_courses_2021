package by.training.simplestapp.main.task01;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5 };
        int b[] = {6, 7, 8};
        int k = 2;
        int result[] = new int[a.length + b.length];
        for(int i=0; i< k; i++){
            result [i] = a[i];
        }
        for(int i=0; i < b.length; i++){
            result [k + i] = b[i];
        }
        for(int i=k+b.length; i< result.length; i++){
            result [i] = a[k++];
        }

        System.out.println(Arrays.toString(result));
    }
}
