import java.util.Scanner;

public class ChocolateDistribution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of choclates to be distributed :");
		int choclates = sc.nextInt();

		System.out.println("Enter the no of children : ");
		int children = sc.nextInt(), count = 0;
		sc.close();

		for (int i = 0; i < children; i++) {
			if (choclates >= i) {
				choclates = choclates - i;
				count++;
			}
		}
		System.out.println("Choclates left : " + choclates);
		System.out.println("No of children got the choclates : " + count);

	}
}
