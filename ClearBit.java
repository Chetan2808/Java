import  java.util.*;
public class ClearBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the position to clear the Bit: ");
        int pos = input.nextInt();
        int BitMask = number << pos;
        int newNumber = (~(BitMask) & number);
        System.out.println("The new number = " + newNumber);
    }
}