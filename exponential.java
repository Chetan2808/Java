import java.util.*;

public class exponential {
    public double expo(double x , double n){
        if(x <= 0){
            System.out.println("Entered number can't be 0 or negative");
            return 0;
        }
        else {
            return Math.pow(x,n);
        }

    }
    public static void main(String[] args){
        exponential pack = new exponential();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double x = input.nextDouble();
        System.out.print("Enter the power : ");
        double n = input.nextDouble();
        System.out.print("The result is: ");
        System.out.print(pack.expo(x,n));
    }
}
