package main;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Hello there bro");
		
		PersonDaoImpl personDao = new PersonDaoImpl();
		
		personDao.getConnection();
		personDao.insert(person);
		personDao.closeConnection();
		
	}
}
