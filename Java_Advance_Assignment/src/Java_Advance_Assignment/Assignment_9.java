package Java_Advance_Assignment;


public class Assignment_9 {
	
public static void main(String[] args) {
	method1();
	method2();
	method3();
	

}	
		public static void method1() {
		    synchronized (String.class) {
		        System.out.println("Acquired lock on String.class object");

		        synchronized (Integer.class) {
		            System.out.println("Acquired lock on Integer.class object");
		        }
		    }
		}

		public static void method2() {
		    synchronized (Integer.class) {
		        System.out.println("Acquired lock on String.class object");

		        synchronized (String.class) {
		            System.out.println("Acquired lock on Integer.class object");
		        }
		    }
		}
		public static void method3() {
		    synchronized (Integer.class) {
		        System.out.println("Acquired lock on Integer.class object");

		        synchronized (String.class) {
		            System.out.println("Acquired lock on String.class object");
		        }
		    }
		}
}
		

