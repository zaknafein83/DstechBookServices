package it.dstech.learning.library.service.interfaces;

import it.dstech.learning.library.model.User;

public interface UserService {
	
	User createUser(User u);

	User createGuestUser(User user);

}
