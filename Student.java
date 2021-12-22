import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        String StudentName = "ramu";
        int studentage = 18;
        double gpa = 9.81;
        char first_initital = StudentName.charAt(0);
        char Last_initial = StudentName.charAt(3);
        boolean attendance = false;

        System.out.println("Name of the student is " + StudentName);
        System.out.println("Student's First initial is "+first_initital+" and last initial is "+Last_initial);
        System.out.println("Students age = "+ studentage);
        System.out.println("His gpa = "+gpa);
        if (attendance == false){
            System.out.println("Has perfect attendance = False");
        }
        else{
            System.out.println("Has perfect attendance = True");
        }
        System.out.println("Enter the new GPA");
        Scanner input = new Scanner(System.in);
        String NEw = input.next();
        System.out.println("New GPA = "+NEw);
    }
}
