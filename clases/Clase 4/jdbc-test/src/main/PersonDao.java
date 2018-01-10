package main;

import java.util.List;

public interface PersonDao {
	public void insert(Person person);
	public List<Person> select();
}
