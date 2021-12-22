import java.util.Scanner;

public class Dinner_bill {
    public static double Bill_Calculate(double Meal_Price, double tip_rate , double tax_rate ){
        double tip = tip_rate * Meal_Price;
        double tax = tax_rate * Meal_Price;
        double result = tip + tax + Meal_Price;
        //System.out.println("Total Bill = $" + result);
        return result;
    }
    public static void main(String[] args){
        System.out.print("Enter The Meal Price :$");
        Scanner input = new Scanner(System.in);
        double Meal_Price = input.nextDouble();

        Bill_Calculate(Meal_Price , 2.3 , 3.4);
        System.out.println("Total Bill = " + Bill_Calculate(Meal_Price, 0.2 , 0.4));


    }
}
