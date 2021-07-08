package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Abstract.GameService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Gamer;

public class GameManager implements GameService {

	private CampaignService campaignService;

	public GameManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	@Override
	public void gameSale(Gamer gamer, Game game, Campaign campaign) {

		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " : " + game.getCategory()
				+ " kategorisinden " + game.getGameCompany() + " �irketi yap�m� " + game.getName() + " oyununu %"
				+ campaign.getDiscountRate() + " oran�nda indirimle " + game.getPrice(campaign)
				+ "  fiyat�na sat�n ald�n�z.");

		this.campaignService.campaignDelete(campaign);
	}

	public CampaignService getCampaignService() {
		return campaignService;
	}

	public void setCampaignService(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

}
