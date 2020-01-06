package Java_Advance_Assignment;


import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
	
	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		return o1.getMarks() -o2.getMarks();
	}

}
