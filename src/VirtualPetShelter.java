import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.put(adoptablePetSearch, virtualPet);
	}

	public void removePet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.remove(adoptablePetSearch);
	}
}
