import java.util.*;
public class Array_Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        String[] names = new String[size];
        for(int i = 0 ; i < size ; i ++){
            System.out.print("Enter the names: ");
            names[i] = input.next();
        }
        for(int i = 0 ; i < size ; i++ ){
            System.out.println("Name " + (i+1) + " is : " + names[i]);
        }
    }
}
