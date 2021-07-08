package gameProject.Concrete;

import gameProject.Abstract.CampaignService;
import gameProject.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Yeni kampanya giri�i olu�turuldu");

	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi");

	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya silindi");

	}

}
