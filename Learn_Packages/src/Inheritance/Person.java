package Inheritance;

public class Person {
private static String name;
public int b;

public Person () { // First Constructor
	name = "No name yet";
	b = 0;
}
public Person (String newName) { // Second Constructor
 name = newName;
	b = 30;
}

/* ��� �������� ���� ������������ ���� ��� �� ����� � ��������������.
 * ��� ��� �������������� ������������, ��������� �������� � �������������� ������������� ��� ��� �������� ����������.
 * �� ����� ��� ����� ��-��������������, �� �������� ���� �������������� ����� ���� (0,  null...).
 * 
 * ��� ������� ���� ���� ������������ ���� ���, ���� ������� � ��������������.
 */


//System.out.println("fdgdfg"); ��� �������� �� �������� �������, ���������� � ������ ����������) ����� ��� �� ��������� ���� ������� (��� ���� (��� ���������� ���� � �������) ��� ���� return;).
//int g; ��� ����������, ���� � ������ �����������.
public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}
public String getName() { // First Method
	return name;
	}
public static void setName(String a) { //Second Method
	name = a;
	}
public void writeOutput () { // Third Method
	System.out.println("�� ����� �����"+ getName());
}

public static void main (String [] args) {
	
	Person l2 = new Student_extend_Person ("sdff2", 123);
	setName("dsfsdfs");
}





// � Person ��� ������ �� �������������� ��� ������ ��� Student_entend_Person � ��� Undergraduate_extends_Student.
// �� ���������� �������.

//�������: ������������ ���� getters, ��� setters ������, ��� ������� �� ������� ��� ��� ����������� �� ������ ��� ���������� ���� ���������� (���� ���� ��� ��������) �� �������� �� ��� abstract ������� ��� �� interfaces: (k = ��������� ��� interface) �� ���� ������ int k = b; � ���� main int k = <Interface_Name>.b;
}
