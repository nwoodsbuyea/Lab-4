import java.util.Scanner;

public class Bank_Charges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter amount of checks: ");
        int checkAmount = Integer.parseInt(input.nextLine());
        
        System.out.println("Total fees: $" + checkCost(checkAmount));
    }            

        public static double checkCost(int amount) {
            double basefee = 10.00;
            double sum;

            if (amount < 20) {
              sum = basefee + (amount * .10);
            } 
            else if (amount > 19 & amount < 40) {
              sum = basefee + (amount * .08);
            } 
            else if (amount > 39 & amount < 60) {
              sum = basefee + (amount * .06);
            } 
            else {
              sum = basefee + (amount * .04);
            }
            
            return(sum);
        }
        
}