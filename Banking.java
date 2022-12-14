//PROGRAM DEVELOPED BY Alex Programmer
import java.io.*;

public class Banking 
   {
    public static void main(String[] args)throws IOException // Main method
    {
        InputStreamReader isr=new InputStreamReader(System.in);  // Create the object for inpu
        BufferedReader br=new BufferedReader(isr);

//      taking inputs

        System.out.println("Enter sum deposited every month");
        int p = Integer.parseInt(br.readLine());

        System.out.println("Enter the number of months for which the sum is invested");
        int n = Integer.parseInt(br.readLine());
        int n1 = n + 1;

        System.out.println("Enter the rate of interest for which the sum is invested");
        int r = Integer.parseInt(br.readLine());

        double maturity, interest;  // Create variables

        interest = p*(n*(n1)/24.0)*r/100.0; // formula for interest
        maturity = (p * n) + interest; // formula for maturity value
        
        // Display outputs
        System.out.println("The Maturity after "+n+" months will be "+maturity);
        System.out.println("The Interest fetched in "+n+" months at "+r+
                "% interest rate will be "+interest);

    }
}
