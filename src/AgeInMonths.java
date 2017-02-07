import java.util.Scanner;

public class AgeInMonths {

	public static void main(String[] args) {
		
		int ageMonths,
			years,
			remainingMonths;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your age in months : ");
		ageMonths = keyboard.nextInt();
		
		years = ageMonths / 12;
		remainingMonths = ageMonths % 12;
		
		System.out.println("Your age in years and months is: " + years + " years and " + remainingMonths + " months");
	}

}
