package Exceptionn;
import java.util.Scanner;
public class Example_1 {
public static void main (String [] args) {
	try {
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter the number of donuts");
	int a = keyboard.nextInt();
	System.out.println("Enter the number of milks");
	int b = keyboard.nextInt();
	
	if (b<0) {
		throw new Exception ("Error"); // ������������� ��� ��� �����������, ��� ������ Exception. �� "errors" ����� ��� ������ String
	
	/* � �������� ������, ����� ��������� �� ��� ��������:
	 * Exception n = new Exception ("Error");
	 * throw n;
	 */
	}
		double c = a / b;
		System.out.println(c);
	
	}
catch (Exception e) { // ������� ��� ���������.
	Exception p = e; // ���� �� ������� ��� ������ ����������, ���� ���������� � ������ throw.
System.out.println(p.getMessage()); // ���� ������ �� ������, ���� �� ����� ��� ������ �� ����������� ���� �����.
System.out.println("Please buy some milks");	
}
	System.out.println("End program");
}
	}
// ��� �������, ����� ��� �����������.	
