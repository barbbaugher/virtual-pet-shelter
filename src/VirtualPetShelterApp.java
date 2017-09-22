import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter aHomeForHomelessVirtualPets = new VirtualPetShelter();

		// Initial virtual pets available for adoption
		VirtualPet firstPet = new VirtualPet("Frankie", "Italian Greyhound", 8, 5, 7);
		aHomeForHomelessVirtualPets.addPet(firstPet);
		VirtualPet secondPet = new VirtualPet("Bob", "Bull Mastiff", 4, 10, 4);
		aHomeForHomelessVirtualPets.addPet(secondPet);
		VirtualPet thirdPet = new VirtualPet("Molly", "Jug", 5, 7, 9);
		aHomeForHomelessVirtualPets.addPet(thirdPet);
		VirtualPet fourthPet = new VirtualPet("Buck", "Mutt", 6, 3, 10);
		aHomeForHomelessVirtualPets.addPet(fourthPet);
		VirtualPet fifthPet = new VirtualPet("Guido", "German Shepherd", 9, 6, 6);
		aHomeForHomelessVirtualPets.addPet(fifthPet);
		VirtualPet sixthPet = new VirtualPet("Gracie", "Puggle", 3, 10, 8);
		aHomeForHomelessVirtualPets.addPet(sixthPet);

		// The welcome display
		System.out.println("Welcome to the Home for Homeless Virtual Pets");

		// The menu display
		System.out.println("Please select an option below by entering the corresponding number:");
		System.out.println("1.  Feed the pets");
		System.out.println("2.  Water the pets");
		System.out.println("3.  Play with a pet");
		System.out.println("4.  Admit a pet");
		System.out.println("5.  Adopt a pet");
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
			aHomeForHomelessVirtualPets.addPet(promptUserForNewPet(input));
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

	// Admit a pet
	private static VirtualPet promptUserForNewPet(Scanner input) {
		System.out.println("Enter the name of the pet:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new VirtualPet(petName, petDescription);
	}

}
