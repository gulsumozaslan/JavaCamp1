package eCommerceBackend.core.googleRegisterAdapter;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.core.utilities.BusinessRules;
import eCommerceBackend.entities.concretes.User;
import eCommerceBackend.signUpWithGoogle.Register;

public class GoogleManager implements AuthService {

	Register register = new Register();
	
	@Override
	public boolean login(User user) {
		boolean result = register.register(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
		if(!result && !this.validate(user)) {
			System.out.println("Sisteme giriþ baþarýsýz");
			return false;
		}
		System.out.println("Sisteme giriþ yapýldý");
		return true;
	
	
	}

	@Override
	public boolean validate(User user) {
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}
	
	private boolean emailAndPasswordCheck(User user) {
		if(user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Kullanýcý adý veya parola eksik");
		}
		System.out.println(user.getFirstName() +" " +user.getLastName() +" : baþarýyla kayýt oldunuz" );
		return true;
	}

}
