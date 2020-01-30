package org.atos.test.login;

public class CourseDetails {
	// method decleration
	private void javaCourse() {
		// This is method
		System.out.println("java course started at jan 21 ");
	}

	// method decleration
	private void oracleCourse() {
		System.out.println("oracle course not started   ");
	}
	private void seleniumCourse() {
		System.out.println("selnuim course not at feb 28  ");
	}

	public static void main(String[] args) {
      //classname objnme =new Classname();
		CourseDetails  d =new CourseDetails();//object create
	//objname.methodnaame();
		d.javaCourse();//method call
		d.oracleCourse();
		d.seleniumCourse();
	}
}
