import java.util.Scanner;

public class DiscountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price1 : ");
		double price1 = sc.nextDouble();
		
		System.out.println("Enter Price2 : ");
		double price2 = sc.nextDouble();
		
		System.out.println("Enter Price3 : ");
		double price3 = sc.nextDouble();
		
		double totalPrice = price1 + price2 + price3;
		System.out.println("Total Price : "+totalPrice);
		
		double offer1 = totalPrice*0.2;
		System.out.println("OFFER 1 : "+offer1);
		
		double offer2 = 0;
		if(price1 < price2 && price1 < price3) {
			offer2 = price1;
			System.out.println("OFFER 2 : "+offer2);
		}
		else if(price2 < price3 && price2 < price1) {
			offer2 = price2;
			System.out.println("OFFER 2 : "+offer2);
		}
		else {
			System.out.println("OFFER 2 : "+offer2);
		}
		
		if (offer1 < offer2) 
			System.out.println("** Offer 1 is valid **");
		 else 
			System.out.println("** Offer 2 is valid **");
		sc.close();
	}

}
