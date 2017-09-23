import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	public Collection<VirtualPet> availablePets() {
		return petsAvailableForAdoption.values();
	}

	public boolean arePetsAvailable() {
		return petsAvailableForAdoption.isEmpty();
	}

	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.put(adoptablePetSearch, virtualPet);
	}

	public void removePet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.remove(adoptablePetSearch);
	}

	// Tick method

	int hungerTick = -1;
	int boredomTick = -2;
	int thirstTick = -1;
	
	void tickMethod() {
		
		for (VirtualPet availablePets : availablePets()) {
			hungerTick += availablePets.getHungerLevel();
			boredomTick +=availablePets.getBoredomLevel();
			thirstTick += availablePets.getThirstLevel();
		}
	}
}
