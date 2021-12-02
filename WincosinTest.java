import java.util.Scanner;

public class WincosinTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Salary : ");
		double salary = scanner.nextDouble();

		calculateHours(salary);
		scanner.close();
	}

	private static void calculateHours(double salary) {
		int temp;
		for (int i = 0; i < salary; i++) {
			temp = (80 * i) + (50 * (i - 10));

			if ((salary - temp >= 0) && (salary - temp < 130)) {
				System.out.println("-> Weekday Hours : " + i);
				System.out.println("-> Weekend Hours : " + (i - 10));
			}
		}
	}

}
