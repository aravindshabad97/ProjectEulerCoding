import java.util.Scanner;

public class MovieRatingCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("No. of Persons for Show 1 : ");
		int show1Persons = scanner.nextInt();

		System.out.print("Rating for Show 1 : ");
		double show1Rating = scanner.nextDouble();

		System.out.print("No. of Persons for Show 2 : ");
		int show2Perons = scanner.nextInt();

		System.out.print("Rating for Show 2 : ");
		double show2Rating = scanner.nextDouble();

		System.out.print("No. of Persons for Show 3 : ");
		int show3Persons = scanner.nextInt();

		System.out.print("Rating for Show 3 : ");
		double show3Rating = scanner.nextDouble();

		int totalPersons = show1Persons + show2Perons + show3Persons;
		System.out.println("Total Persons : " + totalPersons);

		double overallAverageRating = (((show1Persons * show1Rating) + (show2Perons * show2Rating)
				+ (show3Persons * show3Rating)) / (totalPersons));
		System.out.println("OverAll Rating for the Show : " + overallAverageRating);

		scanner.close();
	}

}
