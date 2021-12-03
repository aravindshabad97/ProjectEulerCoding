import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ItemType item = new ItemType();

		System.out.println("Enter the item type name");
		String name = sc.next();

		System.out.println("Enter the cost per day");
		double costPerDay = sc.nextDouble();

		System.out.println("Enter the deposit");
		double deposit = sc.nextDouble();

		item.setName(name);
		item.setCostPerDay(costPerDay);
		item.setDeposit(deposit);
		item.display();

		sc.close();
	}

}
