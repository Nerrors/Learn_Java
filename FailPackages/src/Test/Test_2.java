package Test;

import Inheritance.Person;

public class Test_2 extends Test_1 {
	private int studentNumber;
	private String name = "dcsadcds";
	private Person l;
	public Test_2 ()
	{
	super();
	studentNumber = 0;
	}

	public int getStundentNumber () {
		return studentNumber;
	}
	public void setStudentNumber (int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	public String writeOutput() {
			super.writeOutput();
			System.out.println("Student Number:" + studentNumber + getB());
			return name;
	}
	}
