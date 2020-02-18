package Inheritance;
public class Student_extend_Person extends Person {
private int studentNumber = 20;
private String name = "dcsadcds";
private Person l;
public Student_extend_Person ()
{
super();
studentNumber = 0;
}
public Student_extend_Person (String newName, int b) {
	super(newName); // �������: �� ������ �� ������ �� ���� ����� �� ��� ��������� ��� CONSTRUCTOR ������.
	
	studentNumber = b;
}

public void reset (String s, int newStudentNumber) { // �������: �� ������ �� ������ �� ���� ����� �� ��� ��������� ��� ������.
	setName(s); // �������������� �� ����� ��� ������� ���� ��� ����������. �� �������� ��������� �� ������: name = s;
	studentNumber = newStudentNumber;
}
public int getNam (int g) {
	//***setB(g); ��� ������� �� ��������� �� ������ ��� ��������� B ��� ������ Person.
	//*** ���� ����� ������ ��� �� ��������� ��� ���������� ���� ������ ���� �� ��� ���� ����� �� ������ �� ������� �� ����: public void setbb (Person c) { this.c = c;  } .. ������ ���� ��� Constructor ��� ������ Person ��� ����������.
	System.out.println(b);//���� � ������ ��� ����� �������� ��� � ��������� ����� private (������ ��� ������ �� ���� ��������� ���� ����� ��� ����������). ��� �� ����� �������� �� ������ �� ����� public.
	return getB();
	// �������� �� ��� ������ super �� ��������� �� ������ ��� ������ Person.
}

public int getStundentNumber () {
	return studentNumber;
}
public void setStudentNumber (int newStudentNumber) {
	studentNumber = newStudentNumber;
}
public void writeOutput2() {
		super.writeOutput();
		System.out.println("Student Number:" + studentNumber + getB());
}
}

/* ������� �������: � �������� ��������������� ���� Java ��� �����������.
 * ���������� ��� ��� ������ �� ������� �������, ��� �� ����������� �� �������� ����������.
 * 
 * ���� ��� ����� ���� ��� ���������� �� ���������� �������� ��� ��� interface.
 * 
 * 
 */
