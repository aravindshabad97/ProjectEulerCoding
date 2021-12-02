import java.util.Scanner;

public class Expenses {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter branding expenses : ");
		double brandExp = scanner.nextInt();
		
		System.out.print("Enter travel expense : ");
		double travelExp = scanner.nextInt();
		
		System.out.print("Enter logistics expenses : ");
		double logExp = scanner.nextInt();
		
		System.out.print("Enter Food expenses : ");
		double foodExp = scanner.nextInt();
		
		double totalExp = brandExp + foodExp + logExp + travelExp;
		System.out.println("Total Expenses = "+totalExp);
		
		double brandingPercentage = (brandExp / totalExp) * 100;
		System.out.println("Branding % = "+brandingPercentage);
		
		double foodPercentage = (foodExp / totalExp) * 100;
		System.out.println("Food % = "+foodPercentage);
		
		double logPercentage = (logExp / totalExp) * 100;
		System.out.println("Logistics % = "+logPercentage);
		
		double travelPercentage = (travelExp / totalExp) * 100;
		System.out.println("Travel % = "+travelPercentage);
		scanner.close();
	}

}
