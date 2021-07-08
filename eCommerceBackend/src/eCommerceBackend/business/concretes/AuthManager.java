package eCommerceBackend.business.concretes;

import java.util.regex.Pattern;

import eCommerceBackend.business.abstracts.AuthService;
import eCommerceBackend.core.utilities.BusinessRules;
import eCommerceBackend.entities.concretes.User;

public class AuthManager implements AuthService {

	public static final Pattern validEmail = Pattern.compile(
			"^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$",
			Pattern.CASE_INSENSITIVE);

	@Override
	public boolean login(User user) {
		boolean result = BusinessRules.Run(emailAndPasswordCheck(user));
		return result;
	}

	@Override
	public boolean validate(User user) {
		boolean result = BusinessRules.Run(firstNameCheck(user),lastNameCheck(user),passwordCheck(user),emailFormatCheck(user));
		return result;
	}

	private boolean passwordCheck(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		}
		System.out.println("Þifreniz en az 6 karakter olmalýdýr");
		return false;
	}

	private boolean firstNameCheck(User user) {
		if (!user.getFirstName().isEmpty()) {
			if (user.getFirstName().length() >= 2) {
				return true;
			} else {
				System.out.println("Ýsim en az 2 karakter olmalýdýr!");
				return false;
			}
		}

		System.out.println("Ýsim boþ býrakýlamaz!");
		return false;
	}

	private boolean lastNameCheck(User user) {
		if (!user.getLastName().isEmpty()) {
			if (user.getLastName().length() >= 2) {
				return true;
			}else {
				System.out.println("Soyadý en az 2 karakter olmalýdýr");
				return false;
			}
		}
		System.out.println("Soyadý boþ býrakýlamaz");
		return false;

	}
	
	private boolean emailFormatCheck(User user) {
		if(!validEmail.matcher(user.getEmail()).find()) {
			System.out.println("Geçerli bir mail adresi giriniz");
			return false;
		}
		return true;
	}

	private boolean  emailAndPasswordCheck(User user) {
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Kullanýcý adý veya parola eksik");
			return false;
		}
		System.out.println("Sisteme giriþ yapýldý");
		return true;
	}
}
