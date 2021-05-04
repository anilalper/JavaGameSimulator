
public class Game implements Entity {

	private int id;
	private String name;
	private String genre;
	private String minimumAge;
	private String company;
	private double price;
	
	public Game() {}
	
	public Game(int id, String name, String genre, String minimumAge, String company, double price) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.minimumAge = minimumAge;
		this.company = company;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMinimumAge() {
		return minimumAge;
	}
	public void setMinimumAge(String minimumAge) {
		this.minimumAge = minimumAge;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
