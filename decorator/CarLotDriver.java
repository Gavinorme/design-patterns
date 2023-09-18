package decorator;

import java.util.Scanner;

public class CarLotDriver {
		// final String black = "\u001B[0m";
        // final String red = "\u001B[31m";
        // final String green = "\u001B[32m";
        // final String yellow = "\u001B[33m";
        // final String blue = "\u001B[34m";
        // final String purple = "/u001B[35m";
        // final String cyan = "\u001B[36m";
        // final String RESET = "\033[0m";
	private Scanner scanner;

	public CarLotDriver() {
		scanner = new Scanner(System.in);
	}

	public void runDriver() {
		Vehicle car = new Car();
		System.out.println("\n******* Our new Car *******");
		System.out.println(car);

		Vehicle decoratedVehicle = new Smile(new Rims((car)));
		//Vehicle decoratedVehicle = new Smile(new Rims(new Paint(car, getColor())));
		System.out.println("\n******* We decorated our Car *******\n");
		System.out.println(decoratedVehicle);
	}

	private String getColor() {
		System.out.print(
				"What color would you like to paint your Vehicle (Enter either Red, Green, Purple, Blue, Yellow, Cyan, or None: ");
		return scanner.nextLine().toLowerCase();
	}

	public static void main(String[] args) {
		CarLotDriver carLot = new CarLotDriver();
		carLot.runDriver();
	}
}
