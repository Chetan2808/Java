import java.util.Scanner;
//this code prints the sum of digits using recursion
public class Recursion_sum {
    public static int sum(int n){
        if(n==0 || n<0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int num_sum = sum(n);
        System.out.println(num_sum);
    }
}
