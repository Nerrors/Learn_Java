
package Inheritance;

public class Inheritance {
public static void main (String [] args) {
	
	
	//Student_extend_Person l2 = new Student_extend_Person ("sdffg", 16723);
	Person l2 = new Student_extend_Person ("sdff2", 123);
	Person l3 = new Undergraduate_extends_Student ("sdff", 123, 546); // ���� ������������, ��� ������ ���� � ����� ���� � ����� ��� new.
	Person l4 = new Person ("Test");// ���� �������� �� ������� ���� ��� �������� ��� Person ������ new Person ("", ...);
	// l.setStudentNumber (123);
	l3.writeOutput(); // ��� ������ ������������. ������, ��������� ������� ��� ���� ����� �������.
	System.out.println (l2.getName()); //������� ��� ��� ������������. ��� ������� ��� ������ ��� �� ������� ��� Name �� ������ ���� ����� ���� ��� � ����� Student_extend_Person ��� � Undergraduate_extends_Student  �� ����� ���� �� �����, ����� ��� �� �� ��������� ����� ������������� ����. 
	System.out.println (l3.getName());
	//���� ��� ������� System.out.println(l4.getStundentNumber ());
	System.out.println(l4.getName ());// ��� �������� �� �������������� ��a ����������� Person ��� �� ��������� ��� ������ ��� Undergraduate_extends_Student.

}
}

// �� �������������� ��� getName ��� ��� ��������� �� ����� ���� ���� ����� Student_extends_Person, �� ���� ��� ���� Undergraduate_extends_Student, ��� �� ��� ��������� ���� ������������.
// ���� ������ �� �� �������.