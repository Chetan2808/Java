import java.util.*;
public class Delete_Part_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sb = input.next();
        String result = "";
        for(int i = 0 ; i < sb.length() ; i++){
            if(sb.charAt(i) == '@'){
                break;
            }
            else{
                result = result + sb.charAt(i);
            }
        }
        System.out.println(result);
    }
}
