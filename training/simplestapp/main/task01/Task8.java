package by.training.simplestapp.main.task01;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int N = 10;
        int K = 2;
        int[] A = new int[N];
        int sum = 0;
        Random rand = new Random();


        for(int i=0; i<A.length; i++){
            A[i] = rand.nextInt(20);
        }
        for (int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i=0; i<A.length; i++){
            if (A[i]%K==0){
                sum = sum + A[i];
            }
        }
        System.out.println(sum);

    }
}
