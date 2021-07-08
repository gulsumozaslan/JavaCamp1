package gameProject.Entities;

public class Campaign {
	private int id;
	private int discountRate;
	private String name;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int discountRate, String name) {
		super();
		this.id = id;
		this.discountRate = discountRate;
		this.name = name;
		
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

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountCode(int discountRate) {
		this.discountRate = discountRate;
	}

}
