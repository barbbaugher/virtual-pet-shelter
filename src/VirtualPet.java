
public class VirtualPet {

	// Attributes & initial status

	String petName;
	String petDescription;
	int hungerLevel;
	int boredomLevel;
	int thirstLevel;

	public VirtualPet(String name, String description, int hunger, int boredom, int thirstiness) {
		petName = name;
		petDescription = description;
		hungerLevel = hunger;
		boredomLevel = boredom;
		thirstLevel = thirstiness;
	}

	public VirtualPet(String name, String description) {
		this.petName = name;
		this.petDescription = description;
		this.hungerLevel = 10;
		this.boredomLevel = 10;
		this.thirstLevel = 10;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	// Activities

	void letsEat(int food) {
		hungerLevel += food;
		thirstLevel -= 1;
	}

	public String afterEating() {
		return ("Nom, nom, nom...\n");
	}

	void letsPlay(int fun) {
		boredomLevel += fun;
		thirstLevel -= 2;
	}

	public String afterDancing() {
		return ("Put on your red shoes and dance the blues...\n");
	}

	void letsDrink(int water) {
		thirstLevel += water;
		hungerLevel -= 1;
		boredomLevel -= 1;
	}

	public String afterSleeping() {
		return ("Once upon a time...\n");
	}

	// Tick method

	public void tickMethod() {
		hungerLevel--;
		boredomLevel -= 2;
		thirstLevel--;
	}

	// Is the Danimal still alive?

	Boolean isTheDanimalAliveAndWell() {
		if (hungerLevel > 0 && boredomLevel > 0 && thirstLevel > 0) {
			return true;
		}
		return false;
	}

	public String causeOfDeath() {
		if (hungerLevel <= 0) {
			return ("You starved the Danimal to death...");
		} else if (boredomLevel <= 0) {
			return ("You bored the Danimal to death...");
		}
		return ("The Danimal died of exhaustion.");
	}

}
