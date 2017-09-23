import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	public void getPets() {

		for (Entry<String, VirtualPet> availablePets : petsAvailableForAdoption.entrySet()) {
			System.out.println("Name : " + availablePets.getKey() + " \tType : " + availablePets.getValue().getDescription());
		}
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
