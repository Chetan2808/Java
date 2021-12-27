import java.util.*;
public class FactorialOfNumber {
    public static int factorial(int num){
            int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact = i*fact;

        }
        return fact;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(factorial(num));
    }
}
