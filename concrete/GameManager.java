import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService{

	private List<Game> games;
	public GameManager() {
		this.games=new ArrayList<Game>();
	}
	
	@Override
	public void add(Game game) {
		this.games.add(game);
		System.out.println("Oyun Eklendi. Kampyanya Adi:"+game.getName());
		
	}

	@Override
	public void update(Game game) {
		if (games.stream().anyMatch(c->c.getId()==game.getId()))
		{
			int customerToChangeIndex=games.indexOf(game);
			games.toArray()[customerToChangeIndex]=game;
		}
		else {
			System.out.println("Değiştirilecek Oyun Bulunamadı");
		}	
	}

	@Override
	public void delete(Game game) {
		if (games.stream().anyMatch(c->c.getId()==game.getId()))
		{
			games.remove(game);
		}
		else {
			System.out.println("Çıkarılacak Oyun Bulunamadı");
		}
		
	}

	@Override
	public Game[] getAll() {
		return (Game[]) games.toArray();
	}

}
