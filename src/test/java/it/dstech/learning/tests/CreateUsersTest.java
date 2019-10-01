package it.dstech.learning.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.dstech.learning.library.LibraryAppRunner;
import it.dstech.learning.library.model.User;
import it.dstech.learning.library.service.interfaces.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LibraryAppRunner.class)
public class CreateUsersTest {

	
	@Autowired
	UserService user;
	
	@Test
	public void creatUserAdminTest() {
		User u = new User();
		u.setActive(1);
		u.setName("francesco");
		u.setPassword("ciccio");
		user.createUser(u);
	}
}
