package gameProject.Abstract;

import gameProject.Entities.Campaign;

public interface CampaignService {

	void campaignAdd(Campaign campaign);

	void campaignUpdate(Campaign campaign);

	void campaignDelete(Campaign campaign);
}
