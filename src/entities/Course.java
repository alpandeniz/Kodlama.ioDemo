package entities;

public class Course {
private String courseName;
private int coursePrice;
//coursePrice double olarak tutulabilir. Daha doğru bir yaklaşım olur

public Course(String courseName, int coursePrice) {
	
	this.courseName = courseName;
	
	this.coursePrice = coursePrice;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCoursePrice() {
	return coursePrice;
}
public void setCoursePrice(int coursePrice) {
	this.coursePrice = coursePrice;
}



}
