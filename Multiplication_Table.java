import java.util.Scanner;


public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i =1; i <=10 ; i = i + 1){
            
            int multiply = n * i;
            System.out.println(n + " * " + i + " = " + multiply);
        }




    }
}
