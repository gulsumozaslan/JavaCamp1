package gameProject.Entities;


public class Game {

	private int id;
	private String name;
	private double price;
	private String gameCompany;
	private String category;
	
	
	public Game() {
		
	}
	
	public Game(int id, String name, double price, String gameCompany, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.gameCompany = gameCompany;
		this.category = category;
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

	public String getGameCompany() {
		return gameCompany;
	}

	public void setGameCompany(String gameCompany) {
		this.gameCompany = gameCompany;
	}

	public double getPrice(Campaign campaign) {
		return price - (price*campaign.getDiscountRate()/100) ;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
