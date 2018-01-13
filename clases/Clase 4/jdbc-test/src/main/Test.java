package main;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Fulano");
		
		PersonDaoImpl personDAO = new PersonDaoImpl();
		
		personDAO.getConnection();
		
		List<Person> persons = personDAO.select();
		
		for (Person p : persons) {
			System.out.println(p.getName());
		}}
		
		// personDao.insert(person);
		personDao.closeConnection();
		
	}
}
