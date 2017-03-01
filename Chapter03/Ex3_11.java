package chapter3;

public class Ex3_11 { // Classe GradeBook modificada, figura 3.10
	private String courseName;
	private String instructorName;
	public static void main(String[] args) {
		Ex3_11 GradeBook1 = new Ex3_11("Java", "Lucas");
		GradeBook1.displayMessage();
	} public Ex3_11 (String nameOfCourse, String nameOfInstructor) {
		courseName = nameOfCourse;
		instructorName = nameOfInstructor;
	} public void setCourseName(String name) {
		courseName = name;
	} public String getCourseName() {
		return courseName;
	} public void setInstructorName(String name) {
		
	} public String getInstructorName () {
		return instructorName;		
	} public void displayMessage() {
		System.out.printf("Welcome to the GradeBook for %s!\nThis course is presented by: %s!\n", getCourseName(), getInstructorName());
	}
}

 