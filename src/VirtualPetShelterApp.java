import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();

		// Initial virtual pets available for adoption
		VirtualPet firstPet = new VirtualPet("Frankie", "Italian Greyhound", 8, 5, 7);
		petShelter.addPet(firstPet);
		VirtualPet secondPet = new VirtualPet("Bob", "Bull Mastiff", 4, 10, 4);
		petShelter.addPet(secondPet);
		VirtualPet thirdPet = new VirtualPet("Molly", "Jug", 5, 7, 9);
		petShelter.addPet(thirdPet);
		VirtualPet fourthPet = new VirtualPet("Buck", "Mutt", 6, 3, 10);
		petShelter.addPet(fourthPet);
		VirtualPet fifthPet = new VirtualPet("Guido", "German Shepherd", 9, 6, 6);
		petShelter.addPet(fifthPet);
		VirtualPet sixthPet = new VirtualPet("Gracie", "Puggle", 3, 10, 8);
		petShelter.addPet(sixthPet);

		// The welcome display
		System.out.println("Welcome to the Home for Homeless Virtual Pets");

		do {

			// Display available pets

			System.out.println("Name \t|Hunger |Thirst |Boredom");
			
			for (VirtualPet availablePets : petShelter.availablePets()) {
				System.out.println(availablePets.getName() + "\t|" + availablePets.getHungerLevel() + "\t|"
						+ availablePets.getBoredomLevel() + "\t|" + availablePets.getThirstLevel());
			}

			// The menu display
			System.out.println("Please select an option below by entering the corresponding number:");
			System.out.println("1.  Let's Eat - feed all the pets");
			System.out.println("2.  Let's Drink - water all the pets");
			System.out.println("3.  Let's Play - select a pet to play with");
			System.out.println("4.  Admit a pet");
			System.out.println("5.  Adopt a pet");
			System.out.println("6.  Exit the program");

			String menuEntry = input.next();

			switch (menuEntry) {

			case "1":
				petShelter.tickMethod();
				break;

			case "2":
				petShelter.tickMethod();
				break;

			case "3":
				petShelter.tickMethod();
				break;

			case "4":
				petShelter.addPet(promptUserForNewPet(input));
				petShelter.tickMethod();
				break;

			case "5":
				petShelter.tickMethod();
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

		} while (petShelter.arePetsAvailable() == false);

		System.out.println("Game over.");

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
