package gameProject.Entities;

import java.sql.Date;

public class Gamer extends User {
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date birthDate;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String userCode, String firstName, String lastName, String nationalityId, Date birthDate) {
		super(id, userCode);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthDate = birthDate;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


}
