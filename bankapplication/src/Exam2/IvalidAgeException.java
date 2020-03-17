package Exam2;

public class IvalidAgeException extends Exception {

	public IvalidAgeException() {
		super("age can't be -ve and more than 100");
	}

}