import java.util.*;
public class Delete_Part_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you email: ");
        String email = input.next();
        String result = "";
        for(int i = 0 ; i < email.length() ; i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                result = result + email.charAt(i);
            }
        }
        System.out.println(result);
    }
}
