import java.util.Scanner;

public class ArcheryTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Required target : ");
		int target = sc.nextInt();

		int pointsScored = 0;

		for (int i = 1; i <= target; i++) {
			System.out.println("Enter the Turn : " + i);
			int turn = sc.nextInt();
			pointsScored += turn;
			if (pointsScored >= target) {
				System.out.println("Points Scored : " + pointsScored);
				System.out.println("No. of Turns : " + i);
				break;
			}

		}
		sc.close();
	}

}
