import java.util.*;
public class Reverse_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sb = input.next();
        String result = "";
        for(int i = sb.length()-1 ; i != -1 ; i--){
            result = result + sb.charAt(i);
        }
        System.out.println(result);
    }
}
