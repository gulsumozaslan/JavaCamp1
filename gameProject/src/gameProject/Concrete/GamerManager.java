package gameProject.Concrete;

import gameProject.Abstract.GamerService;
import gameProject.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void create(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" " +gamer.getLastName() + " kayd�n�z ba�ar�yla olu�turuldu");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Bilgileriniz g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Kayd�n�z ba�ar�yla silindi");
		
	}

}
