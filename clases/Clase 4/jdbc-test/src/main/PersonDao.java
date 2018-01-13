package main;

/**
 * To use CRUDS. Force to use this interface in PersonDaoImpl
 */

import java.util.List;


public interface PersonDao {
	public void insert(Person person);
	public List<Person> select();
}
