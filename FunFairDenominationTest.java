import java.util.Scanner;

public class FunFairDenominationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Amount to be returned : ");
		int amount = sc.nextInt();

		int a1 = amount / 100;
		amount = amount % 100;
		int a2 = amount / 50;
		amount = amount % 50;
		int a3 = amount / 10;
		amount = amount % 10;
		int a4 = amount / 5;
		amount = amount % 5;
		int a5 = amount / 2;
		amount = amount % 2;
		int a6 = amount;
		System.out.println(a1 + a2 + a3 + a4 + a5 + a6);

		sc.close();
	}

}
