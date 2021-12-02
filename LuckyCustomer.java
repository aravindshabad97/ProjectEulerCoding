import java.util.Scanner;

public class LuckyCustomer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int billno = sc.nextInt();
		sc.close();
		isLuckyCustomer(date, billno);

	}

	private static void isLuckyCustomer(int date, int billno) {
		int lastdigit;
		if (date < 10) {
			lastdigit = billno % 10;
		} else
			lastdigit = billno % 100;

		System.out.println(lastdigit);
		if (date == lastdigit && billno % date == 0) {
			System.out.println("*** Lucky Customer ***");
		} else
			System.out.println("*** Better Luck Next Time ***");
	}

}
