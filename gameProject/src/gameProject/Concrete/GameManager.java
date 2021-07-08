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
				+ " kategorisinden " + game.getGameCompany() + " þirketi yapýmý " + game.getName() + " oyununu %"
				+ campaign.getDiscountRate() + " oranýnda indirimle " + game.getPrice(campaign)
				+ "  fiyatýna satýn aldýnýz.");

		this.campaignService.campaignDelete(campaign);
	}

	public CampaignService getCampaignService() {
		return campaignService;
	}

	public void setCampaignService(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

}
