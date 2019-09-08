package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDaoTest {
	
	private DriverManagerDataSource dataSource;
	private ContactDao dao;
	
	@BeforeEach
	void setUpBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Pratik@123");
		
		dao = new ContactDaoImpl(dataSource);
		
	}

	@Test
	void testSave() {
	//	fail("Not yet implemented");
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Pratik@123");
		
		dao = new ContactDaoImpl(dataSource);
		
		Contact contact = new Contact("Nikhil Bawne", "nb@gmail.com","Pune", "8087115031");
		int result = dao.save(contact);
		
		assertTrue(result > 0);
		
	}

	@Test
	void testUpdate() {
	//	fail("Not yet implemented");
		
		Contact contact = new Contact(2,"Bhavik Bawne", "bb@gmail.com","Nagpur", "8446793956");
		int result = dao.update(contact);
		
		assertTrue(result > 0);
		
	}

	@Test
	void testGet() {
	//	fail("Not yet implemented");
		
		Integer id = 1;
		Contact contact = dao.get(id);
		if(contact !=null) {
			System.out.println(contact);
		}
		assertNotNull(contact);
		
	}

	@Test
	void testDelete() {
		//fail("Not yet implemented");
		Integer id = 3;
		int result = dao.delete(id);
		System.out.println("The Row has been deleted successfully..");
		assertTrue(result > 0);
		
	}

	@Test
	void testList() {
	//	fail("Not yet implemented");
		
		List<Contact> listContact = dao.list();
		
		for(Contact aContact : listContact) {
			System.out.println(aContact);
		}
		
		assertTrue(listContact.isEmpty());
	}

}
