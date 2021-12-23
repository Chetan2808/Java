import java.util.Scanner;

public class Alt_Avg_func {
        public static void main(String[] args){
            Alt_Avg_func avg = new Alt_Avg_func();
            Scanner input = new Scanner(System.in);
            double num_one = input.nextDouble();
            double num_two = input.nextDouble();
            double num_three = input.nextDouble();
            System.out.println(avg.Average(num_one , num_two , num_three));
        }
        public double Average(double num_one , double num_two , double num_three){
            double avg = (num_one + num_two + num_three) / 3;
            return avg;
        }
    }