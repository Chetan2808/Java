import java.util.Scanner;

public class Pythagorus_Theorm {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first length of the triangle: ");
        double length_one = input.nextDouble();
        System.out.print("Enter the second length of the triangle: ");
        double length_two = input.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double length_three = input.nextDouble();
        double one_two_sq = (length_one * length_one) + (length_two * length_two);
        double one_three_sq = (length_one * length_one) + (length_three * length_three);
        double two_three_sq = (length_two * length_two) + (length_three * length_three);
        if(one_two_sq == (length_three * length_three) || one_three_sq == (length_two * length_two) || two_three_sq == (length_one * length_one)){
            System.out.println("It satisfies the pythagorus theorm");
        }else{
            System.out.println("It does not satisfy the pythagorus theorm");
        }
    }
}
