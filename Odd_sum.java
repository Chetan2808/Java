import java.util.Scanner;

public class Odd_sum {
    public static double sum(double num) {
        double add=0;
        for(int i = 0 ; i < num ; i++){
            if(i%2 != 0){
                add = i + add;
            }

        }
        return add;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit of numbers to input: ");
        double number = input.nextDouble();
        System.out.println(sum(number));
    }
}