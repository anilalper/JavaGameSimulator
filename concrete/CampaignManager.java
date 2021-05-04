import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;



public class CampaignManager implements CampaignService{
private List<Campaign> campaigns;

	public CampaignManager() {
		super();
		campaigns = new ArrayList<Campaign>();
	}

	
	@Override
	public void add(Campaign campaign) {
		this.campaigns.add(campaign);
		System.out.println("Kampanya Eklendi. Kampyanya Adi:"+campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		if (campaigns.stream().anyMatch(c->c.getId()==campaign.getId()))
		{
			int index=IntStream.range(0, campaigns.size())
		    .filter(userInd-> campaigns.get(userInd).getId()==campaign.getId())
		    .findFirst()
		    .getAsInt();
			campaigns.toArray()[index]=campaign;
		}
		else {
			System.out.println("Değiştirilecek Kampanya Bulunamadı");
		}
		
	}

	@Override
	public void delete(Campaign campaign) {
		if (campaigns.stream().anyMatch(c->c.getId()==campaign.getId()))
		{
			campaigns.remove(campaign);
		}
		else {
			System.out.println("Çıkarılacak Kampanya Bulunamadı");
		}
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return campaigns;
	}


	@Override
	public void addGameToCampaign(int campaignId, Game game) {
		if (campaigns.stream().anyMatch(c->c.getId()==campaignId))
		{
			Campaign camp=campaigns.stream().filter(c->c.getId()==campaignId).findAny().orElse(null);
			camp.setGameInCampaign(game);
		}
		else {
			System.out.println("Oyunu Ekleyecek Kampanya Bulunamadı");
		}
	}


	@Override
	public double highestDiscountInAnyCampaign(Game game) {
		
		double discountRatio=0;
		for (Campaign campaign : campaigns) {
		 for (Game item : campaign.getGamesInCampaign()) {
			if (item.equals(game)) {
				if (campaign.getDiscountRate()>discountRatio) {
					discountRatio=campaign.getDiscountRate();
				}
			}
		  }
		}
		return discountRatio;
	}

}
