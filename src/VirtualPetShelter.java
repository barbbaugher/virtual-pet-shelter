import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	public String getPets() {
		for (Entry<String, VirtualPet> availablePets : petsAvailableForAdoption.entrySet()) {
			return availablePets.getKey() + " " + availablePets.getValue();
		}
		return null;
	}

	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.put(adoptablePetSearch, virtualPet);
	}

	public void removePet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.remove(adoptablePetSearch);
	}

}
