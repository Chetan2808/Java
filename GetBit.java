import java.util.*;
public class GetBit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the position: ");
        int pos = input.nextInt();
        int bitMask = 1<<pos;
        if((bitMask & number) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
