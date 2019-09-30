package it.dstech.learning.security.interfaces;

import it.dstech.learning.security.model.User;

public interface UserService {
	
	User createUser(User u);

	User createGuestUser(User user);

}
