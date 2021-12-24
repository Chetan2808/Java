import java.util.Scanner;

public class Greater_Of_Two {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        double num_one = input.nextDouble();
        double num_two = input.nextDouble();
        Greater_Of_Two d = new Greater_Of_Two();
        System.out.println(d.check_greater(num_one,num_two));
    }
    public double check_greater(double one , double two){
        return Math.max(one, two);
    }
}
