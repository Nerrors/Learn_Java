package Inheritance;

public class SecondClassExtendsFirst extends FirstClass {
	
	private String g;
	
	public SecondClassExtendsFirst (String s, int i, String g) {
		super(s, i);
		this.g = g;
	}

	public String toString() {
		
		return data ;
	}
}

//��� � ��������� ����� private, ��� �������� �� ��� ������������� (����� ��� �� ���� � ����� ����� extends ��� FirstClass)

/*
��� ���� � ����� ����� extends ��� FirstClass, ��� ����� public � ���������,
���� �������� �� ������������� ��� ��������� ��������� date;
*/

/*
��� ���� � ����� ��� ����� extends ��� FirstClass, ��� � ��������� ����� static,
���� �������� �� ������������� ��� ��������� ��������� FirstClass.date;
*/

/*
��� ���� � ����� ����� extends ��� FirstClass, ���� ��� � ��������� ����� static,
���� �������� �� ��� ������������� ��� �� ���� ��� �������� �������. (����� ����� ������� ���� � ���������?)
*/