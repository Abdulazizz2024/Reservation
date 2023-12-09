package sem451;

public class Student extends Person{

private String major;
private float gpa;
private int level;

public Student(String name, String id, int age) {
super(name,id,age);
}

public String getMajor() {
return major;
}

public void setMajor(String major) {
this.major = major;
}

public float getGpa() {
return gpa;
}

public void setGpa(float gpa) {
this.gpa = gpa;
}

public int getLevel() {
return level;
}

public void setLevel(int level) {
this.level = level;
}


}