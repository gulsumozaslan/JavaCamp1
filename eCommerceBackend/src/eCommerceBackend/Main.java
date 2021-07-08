package eCommerceBackend;

import java.util.Scanner;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.business.abstracts.UserService;
import eCommerceBackend.business.concretes.AuthManager;
import eCommerceBackend.business.concretes.EmailManager;
import eCommerceBackend.business.concretes.UserManager;
import eCommerceBackend.core.googleRegisterAdapter.GoogleManager;
import eCommerceBackend.dataAccess.concretes.InMemoryUserDao;
import eCommerceBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		AuthService google = new GoogleManager();

		Scanner scan = new Scanner(System.in);
		User user1 = new User(1, "Gülsüm", "Özaslan", "glsmozsln@gmail.com", "1234dk");

		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Deniz");
		user3.setLastName("ÇAM");
		user3.setEmail("denzdenz@hotmail.com");
		user3.setPassword("abc789");

		User user4 = new User();
		user4.setId(4);
		user4.setFirstName("Can");
		user4.setLastName("ÖZMEN");
		user4.setEmail("ddddddd.gmail.com");
		user4.setPassword("can777");

		UserService userService = new UserManager(new InMemoryUserDao(), new AuthManager(), new EmailManager());
		userService.getAll();

//		userService.add(user2);
//		int verificationCode = scan.nextInt();
//		userService.userVerify(user2, verificationCode);
//		userService.getAll();

//		userService.delete(user2);
//		userService.getAll();

//      userService.get(2);

		google.login(user1);
	}

}
