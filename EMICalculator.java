import java.util.Scanner;

/**
 * EMI CALCULATOR
 */
public class EMICalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal");
		double p= sc.nextDouble();
		System.out.println("Enter Rate of interest per annum");
		double pa= sc.nextDouble();
		System.out.println("Enter Tenure in years");
		int years= sc.nextInt();
		
		double r= (pa/12)/100;
		
		int n= years*12;
		
		double x= Math.pow(1+r, n);
		
		double emi = (p*r*x)/(x-1);
		
		System.out.println("EMI  = "+emi);
		sc.close();
				
		
		
		
		

	}

}
