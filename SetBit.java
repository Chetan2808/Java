import java.util.*;
public class SetBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the position to Set Bit: ");
        int pos = input.nextInt();
        int BitMask = 1 << pos;
        int newNumber = BitMask | number;
        System.out.println("The new number = " + newNumber);
    }
}