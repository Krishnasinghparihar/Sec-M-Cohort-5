import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your weight in kilograms");
        double weight = sc.nextDouble();

        
        System.out.print("Enter your height in meters ");
        double height = sc.nextDouble();

       
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

      
        if (bmi < 18.5) {
            System.out.println( "underweight");
        }
        else if (bmi < 25) {
            System.out.println(" normal weight");
        }else if (bmi < 30) {
            System.out.println(" overweight");
        } 
        

        sc.close();
    }
}
