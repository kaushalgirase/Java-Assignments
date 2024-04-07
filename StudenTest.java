package Assignment;

import java.util.*;

public class StudenTest {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	       
	        Student student = new Student();

	       
	        System.out.print("Enter Roll No: ");
	        int rollNo = sc.nextInt();
	        sc.nextLine(); // Consume newline
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Course: ");
	        String course = sc.nextLine();
	        System.out.print("Enter Mark: ");
	        double mark = sc.nextDouble();

	   
	        student.setStudentDetails(rollNo, name, course, mark);

	  
	        student.calculateGrade();
	        student.determineResult();

	      
	        System.out.println("\nStudent Details:");
	        student.printStudentDetails();
	}

}
