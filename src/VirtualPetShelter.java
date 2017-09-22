import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, Set<VirtualPet>> petsAvailableForAdoption = new HashMap<>();

	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.put(adoptablePetSearch, new HashSet<>());

		Set<VirtualPet> adoptablePets = petsAvailableForAdoption.get(adoptablePetSearch);
		adoptablePets.add(virtualPet);
	}

}
