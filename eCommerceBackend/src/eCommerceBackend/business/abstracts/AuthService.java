package eCommerceBackend.business.abstracts;

import eCommerceBackend.entities.concretes.User;

public interface AuthService {
	
	boolean login(User user);
	boolean validate(User user);

}
