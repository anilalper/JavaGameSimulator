import java.util.List;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void addGameToCampaign(int campaignId,Game game);
	double highestDiscountInAnyCampaign(Game game);
	List<Campaign> getAll();
 }
