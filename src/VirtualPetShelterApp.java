import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();

		// Initial virtual pets available for adoption
		VirtualPet frankie = new VirtualPet("Frankie", "Italian Greyhound", 8, 5, 7);
		petShelter.addPet(frankie);
		VirtualPet molly = new VirtualPet("Molly", "Jug", 5, 7, 9);
		petShelter.addPet(molly);
		VirtualPet gracie = new VirtualPet("Gracie", "Puggle", 3, 10, 8);
		petShelter.addPet(gracie);
		VirtualPet buck = new VirtualPet("Buck", "Mutt", 6, 3, 10);
		petShelter.addPet(buck);

		// The welcome display
		System.out.println("Welcome to the Home for Homeless Virtual Pets");

		do {

			// Display available pets

			System.out.println("Name \t|Hunger |Boredom |Thirst");

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
				int food = 6;
				petShelter.feedTheShelter(food);
				;
				petShelter.shelterTickMethod();
				break;

			case "2":
				int water = 5;
				petShelter.waterTheShelter(water);
				petShelter.shelterTickMethod();
				break;

			case "3":
				int fun = 10;
				System.out.println("Enter the pet's name you would like to play with: ");
				String petName = input.next();
				petShelter.getPetNamed(petName).letsPlay(fun);
				petShelter.shelterTickMethod();
				break;

			case "4":
				petShelter.addPet(promptUserForNewPet(input));
				petShelter.shelterTickMethod();
				break;

			case "5":
				System.out.println("Enter the pet's name you would like to adopt: ");
				petName = input.next();
				petShelter.petsAvailableForAdoption.remove(petName);
				petShelter.shelterTickMethod();
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
