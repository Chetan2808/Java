import java.util.*;
public class Array_Traspose {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows of array : ");
        int rows = input.nextInt();
        System.out.print("Enter the columns of array : ");
        int cols = input.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter the number : ");
                numbers[i][j] = input.nextInt();
            }
        }
        //printing the transpose of the array
        for(int i = 0 ; i < cols ; i ++ ){
            for(int j = 0 ; j < rows ; j++){
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }
}
