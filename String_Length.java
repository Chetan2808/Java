import java.util.*;
public class String_Length {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String arr[] = new String[size];
        int length = 0 ;
        input.nextLine();
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter a String: ");
            arr[i] = input.nextLine();
            length = length + arr[i].length();
        }
        System.out.println(length);
    }
}
