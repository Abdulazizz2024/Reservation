package sem451;

import java.io.Serializable;

public abstract class Room  implements Serializable{

	/**
	 * 
	 */
	protected String name;
	protected String location;
	protected float length;
	protected float width;
	protected boolean window;
	protected boolean secDoor;
	
	public Room(String n) {
		this.setName(n);
	}

	
	
	
	public boolean hasWindow() {
		return window;
	}




	public void setWindow(boolean window) {
		this.window = window;
	}




	public boolean hasSecDoor() {
		return secDoor;
	}




	public void setSecDoor(boolean secDoor) {
		this.secDoor = secDoor;
	}




	@Override
	public String toString() {
		return "Room [name=" + name + ", location=" + location + ", length=" + length + ", width=" + width + "]";
	}

	public float getArea() {
		return width*length;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
}
