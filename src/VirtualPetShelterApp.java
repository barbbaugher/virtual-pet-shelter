import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter aHomeForHomelessVirtualPets = new VirtualPetShelter();

		// The welcome display
		System.out.println("Welcome to the Home for Homeless Virtual Pets");

		// The menu display
		System.out.println("Please select an option below by entering the corresponding number:");
		System.out.println("1.  Feed the pets");
		System.out.println("2.  Water the pets");
		System.out.println("3.  Play with a pet");
		System.out.println("4.  Adopt a pet");
		System.out.println("5.  Admit a pet");
		System.out.println("6.  Exit the program");

		String menuEntry = input.next();

		switch (menuEntry) {

		case "1":
			break;

		case "2":
			break;

		case "3":
			break;

		case "4":
			break;

		case "5":
			break;

		// Exit menu
		case "6":
			System.out.println("Thanks for playing.");
			System.exit(0);
			break;

		// Invalid menu option entered
		default:
			System.out.println("Please select a valid menu option.");
		}

		input.close();
	}

}
