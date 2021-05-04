import java.util.Date;
import java.util.List;

public class Campaign {

	private long id;
	private String name;
	private String description;
	private double discountRate;
	private Date startDate;
	private Date endDate;
	private List<Game> gamesInCampaign;
	
	
	public Campaign() {}

	public Campaign(long id, String name, String description, double discountRate, Date startDate, Date endDate,
			List<Game> gamesInCampaign) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.gamesInCampaign = gamesInCampaign;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public List<Game> getGamesInCampaign() {
		return gamesInCampaign;
	}
	public void setGameInCampaign(Game gameInCampaign) {
		this.gamesInCampaign.add(gameInCampaign);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setGamesInCampaign(List<Game> gamesInCampaign) {
		this.gamesInCampaign = gamesInCampaign;
	}
}
