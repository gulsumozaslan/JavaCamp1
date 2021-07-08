package gameProject.Adapters;

import gameProject.Abstract.ValidationService;
import gameProject.Entities.Gamer;

public class ValidationManager implements ValidationService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		if (!gamer.getFirstName().isEmpty() && !gamer.getFirstName().isEmpty()
				&& gamer.getNationalityId().length() == 11) {
			System.out.println("Kimlik doğrulaması başarılı");
			return true;
		} else {
			System.out.println("Kimlik doğrulaması başarısız");
			return false;
		}

	}
}
