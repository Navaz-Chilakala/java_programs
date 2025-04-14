import java.util.Scanner;

/**
 * This program reads celsius value as input and converts into fahrenheit
 * celcius
 * fahrenheit
 * 
 */


public class Converter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float c = sc.nextFloat();
		
		float f= (float) (( c*1.8) +32);
		
		System.out.println(f);
		
		
		
		// TODO Auto-generated method stub

	}

}
