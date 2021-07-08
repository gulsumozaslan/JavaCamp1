package gameProject.Abstract;

import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Gamer;

public interface GameService {

	void gameSale(Gamer gamer, Game game, Campaign campaign);
}
