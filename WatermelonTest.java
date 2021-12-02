import java.util.Scanner;

public class WatermelonTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Weight of Watermelon in kgs : ");
		int weight = sc.nextInt();

		if (weight % 2 == 0) {
			int half = weight / 2;
			System.out.println("I get " + half + " kgs and my sibling gets " + half + " kgs !");
			System.out.println("Possible ways of sharing");
			for (int i = 1; i < weight; i++) {
				for (int j = 1; j <= weight; j++) {
					int temp = i + j;
					if (temp == weight) {

						System.out.println(i + " " + j);
					}
				}
			}
		} else {
			System.out.println("Sorry, you can't buy. Please look for even weight Watermelon !");
		}
		sc.close();
	}

}
