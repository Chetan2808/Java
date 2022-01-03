import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int num) {
        int i = 0;
        int j = 1;
        System.out.print(i + " ");
        System.out.print(j + " ");
        for (int a = 1; a <= num - 2; a++) {
            int k = i + j;
            System.out.print(k + " ");
            i = j;
            j = k;
            }
        }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        fibonacci(num);
    }
}