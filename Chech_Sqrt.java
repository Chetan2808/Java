import java.util.Scanner;
import java.lang.*;
public class Chech_Sqrt {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number: ");
            int num = input.nextInt();
            double sqrt = Math.sqrt(num);
            if ((sqrt - Math.floor(sqrt)) ==0){
                System.out.print("Yes, the given number is perfect square.");
            }
            else{
                System.out.print("No, the given number is not perfect square.");
            }
        }
    }

