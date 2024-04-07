package Assignment;

/*Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a. assign values for rollNo, name, course and mark.
b. Find out the grade for the student(if mark &gt;90, then grade is A, if
mark is between 80 and 90, then grade is B, if mark is between 70
and 80, then grade is C, if mark is between 60 and 70, then grade
is D, otherwise, grade is F.
c. Find the result of the student. If mark&gt;60, then the result is Pass,
otherwise Fail
d. Print out the details of the student*/

public class Student {
	private int rollNo;
    private String name;
    private String course;
    private double mark;
    private char grade;
    private String result;

    
    public void setStudentDetails(int rollNo, String name, String course, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
    }

   
    public void calculateGrade() {
        if (mark > 90) {
            grade = 'A';
        } else if (mark >= 80) {
            grade = 'B';
        } else if (mark >= 70) {
            grade = 'C';
        } else if (mark >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

   
    public void determineResult() {
        result = (mark > 60) ? "Pass" : "Fail";
    }

    
    public void printStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}


