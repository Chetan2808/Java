import java.util.Scanner;

public class Multiple_Choice_Question {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Q1. Which of the following country has one of the highest taxes");
        String A = "A.Denmark";
        String B = "B.China";
        String C = "C.Bangladesh";
        String D = "D.South Africa";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        while(true){
        System.out.print("Your Input: ");
        char Input = user_input.next().toUpperCase().charAt(0);
        if (Input == A.charAt(0)) {
            System.out.println("Congratulations!");
            System.out.println("Correct Answer!");
            break;
        } else if(Input == B.charAt(0) || Input == C.charAt(0) || Input == D.charAt(0)) {
            System.out.println("Incorrect Choice");
            System.out.println("try again");

        }
        else {
            System.out.println("Invalid input");
            break;
        }
    }
}}