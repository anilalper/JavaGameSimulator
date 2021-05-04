import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer realCustomer=new Customer(1, "Alper", "Avdan", "1234", "1983");
		Customer fakeCustomer=new Customer(1, "Enginr", "Avdan", "1234", "1987");
		
		CustomerManager customerManager=new CustomerManager(new UserValidatorManager());
		customerManager.add(realCustomer);
		customerManager.add(fakeCustomer);
		
		
		for (Customer customer : customerManager.getAll()) {
			System.out.println("Müşteri:"+customer.getFirstName());
		}
		Game game1=new Game(1, "CS:GO", "Fps", "16", "Valve", 122.4);
		Game game2=new Game(2, "Age Of Empires II", "Strategy", "12", "Valve", 80.0);
		Game game3=new Game(3, "Wow", "MMORPG", "15", "Blizzard", 100.2);
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		List<Game> campaign1games=new ArrayList<Game>();
		campaign1games.add(game1);
		campaign1games.add(game2);
		List<Game> campaign2games=new ArrayList<Game>();
		campaign2games.add(game3);
		Campaign campaign1=new Campaign(1, "Birinci Kampanya", "1 Acikalama",20, new Date(2021,05,01),new Date(2021,05,30),campaign1games);
		Campaign campaign2=new Campaign(1, "İkinci Kampanya", "1 Acikalama",15, new Date(2021,05,01),new Date(2021,05,30),campaign2games);

		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		Campaign Updatecampaign2=new Campaign(1, "İkinci Kampanya", "2 Acikalama",10, new Date(2021,05,01),new Date(2021,05,30),campaign2games);

		
		
		campaignManager.update(Updatecampaign2);
		
		OrderManager orderManager=new OrderManager(campaignManager);
		
		orderManager.orderGame(game1, realCustomer);
		orderManager.orderGame(game3, realCustomer);
		
		Customer ChabgedrealCustomer=new Customer(1, "Alper1", "Avdan", "1234", "1983");
		Customer ChangedfakeCustomer=new Customer(2, "Enginr1", "Avdan", "123224", "1986");
		//customerManager.update(ChangedfakeCustomer);
		customerManager.update(ChabgedrealCustomer);
		
		for (Customer customer : customerManager.getAll()) {
			System.out.println("Müşteri:"+customer.getFirstName());
		}
		customerManager.delete(ChabgedrealCustomer);
		
		for (Customer customer : customerManager.getAll()) {
			System.out.println("Müşteri:"+customer.getFirstName());
		}

	}

}
