import java.util.Scanner;
public class FortuneTeller {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number between 0 and 10: ");
        int Guessing_Number = input.nextInt();
        if (Guessing_Number <= 5){
            System.out.println("You will have a great day");
        }
        else if(Guessing_Number <= 10){
            System.out.println("Your Shoe collection will make you happy");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
