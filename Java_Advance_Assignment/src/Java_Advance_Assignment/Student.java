package Java_Advance_Assignment;


public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private int marks;


public Student(String name, int id,int mark){
	this.name = name;
	this.id = id;
	this.marks = mark;
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getMarks() {
	return marks;
}


public void setMarks(int marks) {
	this.marks = marks;
}

public String toString (){
	return "name="+this.name+" id="+this.id+" and marks="+this.marks;
}


public int compareTo(Student ob) {
	// TODO Auto-generated method stub
	return (this.name).compareTo(ob.name);
}

}