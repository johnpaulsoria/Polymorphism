public class Student {
	
	//initialing variables
	private String name;
	private String course;
	private float tuitionFee;
	private int studentNumber;
	private static int counter;
	
	public Student(String name, String course, float tuitionFee) {
		this.name = name;
		this.course = course;
		this.tuitionFee = tuitionFee;
		this.studentNumber = ++counter;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public float getTuitionFee() {
		return tuitionFee;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	
	@Override
	public String toString() {
		return "\nStudent # " + studentNumber + ": " + name + " is taking up " + course + " with a tuition fee of " + tuitionFee;
	}
}
