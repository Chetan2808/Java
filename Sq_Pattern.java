//Solid rectangle
import java.util.Scanner;

public class Sq_Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int a = input.nextInt();
        System.out.print("Enter the column:");
        int v = input.nextInt();
        for(int i = 0 ; i<a ; i ++){
            for(int j = 0 ; j < v ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
