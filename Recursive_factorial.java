import java.util.Scanner;

public class Recursive_factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rec = factorial(n);
        System.out.println(rec);
    }
    public static int factorial(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
