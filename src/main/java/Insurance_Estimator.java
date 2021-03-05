import java.util.Scanner;

public class Insurance_Estimator {
    public static void main(String[] args) {        
        System.out.println("Please input age: ");
        
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Total insurance cost is: $" + insuranceCost(userAge) + "/year.");
        
    }
    
    public static double insuranceCost(int age) {
        double insuranceCalc = (5 * age) + 300;
                
        return insuranceCalc;   
    }
}
