package gameProject.Entities;

public class GameCompany extends User {
	private String name;

	public GameCompany(int id, String userCode, String name) {
		super(id, userCode);
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
