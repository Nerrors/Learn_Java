package ConstructorDifferences;

/*
 �� overloading ����������� ���� �������� constructor methods ����� �� ���� ����� 
 ���� ������������ �����������.
 
 Compile-time error ����������� ���� � compiler ��� ������ �� ��������� ��� �����������.
 
 � ���������� ������� ���� ������������, �������� overloading resolution.
 */

public class Overloading {
	private int number;
	private boolean bool;
	private String name;
	
	public Overloading() { //Constructor 1
		number =20;
		bool = true;
		name = "Aleksandros";
	}
	public Overloading(String name) { //Constructor 2
		number =20;
		bool = true;
		this.name=name;
	}
	
	//toString()
	public String toString() {
		return " " + number + " " + bool + " " + name;
	}
	
public static void main (String[] args) {
	
	Overloading dfi = new Overloading();
	Overloading dfi2 = new Overloading("Alex");
	System.out.println(dfi);
	System.out.println(dfi2);
}

}


