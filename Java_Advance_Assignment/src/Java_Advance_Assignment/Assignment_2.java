package Java_Advance_Assignment;


import java.util.TreeMap;

public class Assignment_2 {

	public static void main(String[] args) {
		
		//Assignment:Write a java program to store 5 students information in a treeMap Note: student object has student name and student reg no. *
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(101, "Student1");
		map.put(201, "Student2");
		map.put(301, "Student3");
		map.put(401, "Student4");
		map.put(501, "Student5");
		
System.out.print("Student information: " + map);
	}

}
