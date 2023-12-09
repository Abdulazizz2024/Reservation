package sem451;

import java.io.Serializable;

public class Person  implements Serializable{
	String name;
	String id;
	int age;
	boolean blocked;
	
	public Person(String name, String id, int age) {
		this.setId(id);
		this.rename(name);
		this.setAge(age);
		this.setBlocked(false);
	}
	@Override
	public String toString() {
	return "Person [" + name + "-" + id + "]";
	}
	public String name() {
	return name;
	}
	public void rename(String name) {
	if(name == null || name.isEmpty())
	name = "na";
	this.name = name;
	}
	public String getId() {
	return id;
	}
	public void setId(String id) {
	this.id = id;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public boolean isBlocked() {
	return blocked;
	}
	public void setBlocked(boolean blocked) {
	this.blocked = blocked;
	}


}