import java.util.Scanner;

public class User_Input {
    public static void numInput(int num) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        do {
            if (num > 0) {
                positive++;
            } else if (num == 0) {
                zero++;
            } else {
                negative++;
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to continue? y/n");
            String ans = input.next();
            if(ans.equalsIgnoreCase("y")){
                System.out.print("Enter the next number: ");
                num = input.nextInt();
            }
            else{
                System.out.println("The count of positive numbers entered = " + positive );
                System.out.println("The count of negative numbers entered = " + negative);
                System.out.println("The count of zero's entered = " + zero);
                break;
            }
        }while(true);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        numInput(num);
    }
}