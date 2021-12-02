import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double currentrunrate, remainingOvers, requiredrunrate;
		System.out.println("Enter number of overs : ");
		int overs = sc.nextInt();
		System.out.println("Enter targeted runs : ");
		int target = sc.nextInt();
		System.out.println("Enter overs bowled in 2nd Inns : ");
		int currentOvers = sc.nextInt();
		System.out.println("Enter runs scored : ");
		int score = sc.nextInt(), remainingRuns;

		remainingOvers = overs - currentOvers;
		remainingRuns = target - score;

		requiredrunrate = remainingRuns / remainingOvers;

		currentrunrate = score / currentOvers;

		System.out.println("Current RR :" + currentrunrate);

		System.out.println("Required RR " + requiredrunrate);
		sc.close();
	}
}