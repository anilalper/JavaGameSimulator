import java.util.ArrayList;
import java.util.List;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String yearOfBirth;
	private List<Game> purchasedGames;
	
	public Customer() {
	// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String firstName, String lastName, String nationalityId, String yearOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		this.purchasedGames=new ArrayList<Game>();
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public String getYearOfBirth() {
		return this.yearOfBirth;
	}


	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public List<Game> getPurchasedGames() {
		return purchasedGames;
	}

	public void setPurchasedGame(Game purchasedGame) {
		this.purchasedGames.add(purchasedGame);
	}



}
