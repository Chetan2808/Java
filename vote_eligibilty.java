import java.util.Scanner;

public class vote_eligibilty {
    public boolean vote_check(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();
        vote_eligibilty pack = new vote_eligibilty();
        System.out.println(pack.vote_check(age));
    }
}