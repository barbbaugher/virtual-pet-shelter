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
	
	public String searchForAPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		return adoptablePetSearch;
	}

	public void removePet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.remove(adoptablePetSearch);
	}

	// Tick method

	public void shelterTickMethod() {

		for (VirtualPet availablePets : availablePets()) {
			availablePets.tickMethod();
		}
	}
	
	public void feedTheShelter(int food) {

		for (VirtualPet availablePets : availablePets()) {
			availablePets.letsEat(food);
		}
	}
	
	public void waterTheShelter(int water) {

		for (VirtualPet availablePets : availablePets()) {
			availablePets.letsDrink(water);
		}
	}
}
