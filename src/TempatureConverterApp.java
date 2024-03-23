import java.util.Scanner;

public class TempatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Temp App");
		
		Scanner sc = new Scanner (System .in);
		
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter degrees in Fahrenheit");
			double F = sc.nextDouble();
			
			double C =Math.round(F-32) * 5/9;
			
			
			System.out.println("Answer in celsius:" +C);
		
		System.out.println(" Continue? (Y/y)");
		choice = sc.next();
		}
	}
	}


