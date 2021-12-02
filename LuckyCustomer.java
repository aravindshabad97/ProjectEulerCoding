import java.util.Scanner;

public class LuckyCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		int date = sc.nextInt();
		System.out.println("Enter the billno");
		int billno = sc.nextInt();
		sc.close();
		int temp = billno % 10;
		int temp1 = billno % 100;

		if (date <= 9) {
			if (date == temp && billno % date == 0) {
				System.out.println("Lucky Customers...");
			} else {
				System.out.println("Unlucky Customer...");
			}
		} else if ((date > 9 || date <= 31)) {
			if (date == temp1 && billno % date == 0) {
				System.out.println("Lucky customer...");
			} else {
				System.out.println("Unlucky Customer...");
			}
		} else {
			System.out.println("Unlucky Customer...");
		}

		if (date > 31) {
			throw new IllegalArgumentException(" Please give valid date ");
		}
	}

}
