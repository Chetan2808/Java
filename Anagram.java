import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String one = input.next();

        System.out.print("Enter the second String: ");
        String two = input.next();

        boolean isAnagram = true;
        //int i = 0;
        if (one.length() == two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (two.indexOf(one.charAt(i)) == -1) {
                    System.out.println("Not a anagram");
                    isAnagram = false;
                    break;

                }
            }
            if (isAnagram) {
                System.out.println("Is a anagram");
            }
        } else {
            System.out.println("Not a anagram");
        }
    }
}






               /* if (two.indexOf(one.charAt(i)) >= 0) {
                    i++;
                    if ((two.indexOf(one.charAt(i)) >= 0)) {
                        i++;
                        if ((two.indexOf(one.charAt(i)) >= 0)) {
                            i++;
                            if ((two.indexOf(one.charAt(i)) >= 0)) {
                                System.out.println("Its a anagram");
                            }
                        }
                    }
                }

                else {
                System.out.println("Not a Anagram");
            }
        }
    }

*/