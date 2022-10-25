import java.util.*;


public class RoomCalculator {
	public static void main(String[] args) {


		System.out.println("Welcome to Grand Circus’ Room Detail Generator!");

		Scanner scan = new Scanner(System.in);
		String answer;

		do {


			System.out.print("Enter Length:");
			double length = scan.nextDouble();

			System.out.print("Enter Width:");
			double width = scan.nextDouble();


			double area = length * width;
			System.out.println("Area:" + area);


			double perimeter = (length *2) + (width*2);
			System.out.println("Perimeter:" + perimeter);


			System.out.println("Continue? (y/n):");
			answer = scan.next();
		}
		while (answer.equals("y"));
	}
}