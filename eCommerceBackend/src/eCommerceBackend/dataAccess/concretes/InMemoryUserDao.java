package eCommerceBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackend.dataAccess.abstracts.UserDao;
import eCommerceBackend.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		
		//Kullan�c�lar
		User user1 = new User(1, "G�ls�m","�ZASLAN","glsmozsln@gmail.com", "123dk54");
		User user2 = new User(2,"Ege","MERT","mtmtmt@hotmail.com","abc456");
		
		users.add(user1);
		users.add(user2);
	}
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName() +" isimli kullan�c� ba�ar�yla eklendi ");
		
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " isimli kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName()+" "+user.getLastName() + " isimli kullan�c� silindi");
		
	}

	@Override
	public User get(int id) {
		User user = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		System.out.println("Kullan�c� ad� : " +user.getFirstName());
		return user;
	}

	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " +user.getLastName());
		}
		System.out.println("--------------");
		return this.users;
	}

	@Override
	public User getEmail(String email) {
		User user = users.stream().filter(u -> u.getEmail() == email).findFirst().orElse(null);
		return user ;
	}

}
