import java.util.Scanner;

public class circumfrenfe {
    public double circumfrence(double radius){
        return (6.28) * radius;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();
        circumfrenfe pack = new circumfrenfe();
        System.out.println(pack.circumfrence(radius));
    }
}
