
public class OrderManager implements OrderService {

	private CampaignService campaignService;
	
	public OrderManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}
	@Override
	public void orderGame(Game game, Customer customer) {
		customer.setPurchasedGame(game);
		double discount=campaignService.highestDiscountInAnyCampaign(game);
		double gamePrice=(game.getPrice()*discount)/100;
		System.out.println("Kullanıcı: "+customer.getFirstName()+" "+customer.getLastName()+", "+game.getName()+" adli oyunu yüzde "+discount+" ile "+gamePrice+" olarak aldı");
	}

}
