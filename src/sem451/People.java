package sem451;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People implements FileNames, DataTasks{

	private Map<String, Person> people;
	public People() {
		people = new HashMap<>();
	}

	public int howManyPeople() {
		return people.size();
	}
	public void clearAllPeople() {
		people.clear();
	}
	public void printPeople() {
		for (Map.Entry<String, Person> e : people.entrySet()) 
		{
		      System.out.println(e.getValue());
		}
	}
	
	public boolean addPerson(Person p) {
		return addPerson(p.name(),p.getId(),p.getAge());
	}
	
	public boolean addPerson(String name, String id, int age) {
		if(people.containsKey(id)) 
		{
			System.out.println("Sorry, id is used! User cannot be created.");
			return false;
		}
		people.put(id, new Person(name,id,age));
		System.out.println(name+" has been added.");
		System.out.println("No. of users is: "+people.size());
		return true;
	}
	
	/*public boolean addPerson(String name, String id, int age) {
	    // Check if the ID is already used
	    if (people.containsKey(id)) {
	        System.out.println("Sorry, id is used! User cannot be created.");
	        return false;
	    }

	    // Verify age is within a specific range
	    if (age < 30 || age > 70) {
	        System.out.println("Please re-enter the age which from 30 to 70.");
	        return false;
	    }

	    // Add the new person since ID is unique and age is valid
	    people.put(id, new Person(name, id, age));
	    System.out.println(name + " has been added.");
	    System.out.println("No. of users is: " + people.size());
	    return true;
	}*/

	
	public boolean removePerson(String id) {
		Person p = people.remove(id);
		if(p==null) {
			System.out.println("Sorry, no such a user!");
			return false;
		}
		System.out.println(p.name()+" has been removed.");
		System.out.println("No. of users is: "+people.size());
		return true;
	}
	
	
	public Person getPersonById(String id) {
		Person p = people.get(id);
		if(p==null) {
			System.out.println("Sorry, no such a user!");
			return null;
		}
		return p;
	}

	
	/*public void loadDataFromFile() throws FileNotFoundException, IOException, Exception{
		people.clear();
		ObjectInputStream o;
		o = new ObjectInputStream(new FileInputStream(PEOPLE_FILE));
		o.close();
		people=(Map<String,Person>) o.readObject();
		System.out.println("Finished Loading people data.");
		System.out.println(people.size()+" user(s) imported.");
	}*/
	
	
	
	public void loadDataFromFile() throws FileNotFoundException, IOException, Exception {
		  File file = new File(PEOPLE_FILE);
		  if (!file.exists()) {
		        System.out.println("People File Not Found to load!");
		        return;
		    }	  
	    people.clear();
	    try (ObjectInputStream i = new ObjectInputStream(new FileInputStream(PEOPLE_FILE))) {
	        people = (Map<String, Person>) i.readObject();
	    }
	    System.out.println("Finished Loading people data.");
	    System.out.println(people.size() + " user(s) imported.");
	}


	@Override
	public void saveDataToFile()  throws FileNotFoundException, IOException, Exception{
		if(people.isEmpty()) System.out.println("No users to save!");
		else 
		{
			ObjectOutputStream o;			
			o = new ObjectOutputStream(new FileOutputStream(PEOPLE_FILE));
			o.writeObject(people);
			o.close(); 
		}
	}
}
