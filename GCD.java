import java.util.*;
public class GCD {
    public static void gcd(int numOne , int numTwo){
        int gcd = 1 ;
        if(numOne < numTwo) {
            for (int i = 1; i <= numOne; i++) {
                if (numOne % i == 0 && numTwo % i == 0) {
                    gcd = i;
                }
            }
        }


        else {
            for (int i = 1; i <= numTwo; i++) {
                if (numOne % i == 0 && numTwo % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println("The GCD of two number = " + gcd);

        }





    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numOne = input.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = input.nextInt();
        gcd(numOne,numTwo);
    }
}
