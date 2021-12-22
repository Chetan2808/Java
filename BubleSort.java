import java.util.Arrays;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args){
        double[] array = {2.2 , 5 , 6 , 8 , 3 , 1,1.2,0.2};
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 1 ; j< array.length ; j++){
                if(array[j] < array[j-1]){
                    double temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
