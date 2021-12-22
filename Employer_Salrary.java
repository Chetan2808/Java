import java.util.Scanner;

public class Employer_Salrary {
    public static double SalaryCalculator(double No_of_Hours , double Per_Hour_Income , int vacation_days ){
        if(No_of_Hours < 0 || Per_Hour_Income < 0){
            return -1;
        }
        double unpaid_time = Per_Hour_Income * 8 * vacation_days;
        double Total_Salary = No_of_Hours * Per_Hour_Income;
        return (Total_Salary * 52) - unpaid_time ;
    }
    public static void main(String[] args){
        System.out.print("Enter number of hours work per week: ");
        Scanner input = new Scanner(System.in);
        double No_Of_Hours = input.nextDouble();
        System.out.print("Enter amount made per hour: ");
        double Per_hour_income = input.nextDouble();
        System.out.print("Enter Number of vaccation days: ");
        int Vacation_Days = input.nextInt();
        double Salary = SalaryCalculator(No_Of_Hours , Per_hour_income , Vacation_Days);
        System.out.println("Total Salary of employee = $" + Salary);
    }
}
