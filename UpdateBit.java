import java.util.*;
public class UpdateBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the position you want to update : ");
        int pos = input.nextInt();
        System.out.println("What do you want to update the selected bit ? 0 or 1");
        int operation = input.nextInt();
        int bitMask = 1 << pos;
        if(operation == 1){
            int newNumber = bitMask | number;
            System.out.println("The new number is " + newNumber);
        }
        else if(operation == 0){
            int newNumber = (~(bitMask) & number);
            System.out.println("The new number is " + newNumber);
        }
        else{
            System.out.println("The input is invalid. Valid input are 0 or 1 only.");
        }
    }
}
