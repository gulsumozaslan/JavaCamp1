package gameProject.Concrete;

import gameProject.Abstract.GamerService;
import gameProject.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void create(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" " +gamer.getLastName() + " kaydýnýz baþarýyla oluþturuldu");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Bilgileriniz güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "Kaydýnýz baþarýyla silindi");
		
	}

}
