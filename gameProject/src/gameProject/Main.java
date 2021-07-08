package gameProject;

import gameProject.Concrete.CampaignManager;
import gameProject.Concrete.GameManager;
import gameProject.Concrete.GamerManager;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Game game1 = new Game(1, "VALORANT", 150, "Riot Games", "Niþancýlýk");

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setUserCode("14EGE324");
		gamer1.setFirstName("Ege");
		gamer1.setLastName("Demir");
		gamer1.setNationalityId("23456789652");
		// gamer1.setBirthDate(new GregorianCalendar(1993, 11 , 16)); //doðum tarihi
		// eksik

		Campaign campaign1 = new Campaign(1, 45, "Efsane yaz indirimi");

		GameManager gameManager = new GameManager(new CampaignManager());
		gameManager.gameSale(gamer1, game1, campaign1);

		GamerManager gamerManager = new GamerManager();
		gamerManager.create(gamer1);

//		ValidationManager validation = new ValidationManager();
//		validation.checkIfRealPerson(gamer1);

	}

}
