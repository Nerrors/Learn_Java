package Exceptionn;
import java.util.Scanner;
import java.util.*;

public class IllegalAruments {
	
public static double toString (double radius) throws IllegalArgumentException, InputMismatchException { // ��� Throws ��������������� �� �����.
	if (radius<0)
		throw new IllegalArgumentException ("Error");
	return radius;
}
	
public static void main (String[] args) {
System.out.println("���� ��� Double");
try {
Scanner scan = new Scanner (System.in);
Double str = scan.nextDouble();
	System.out.println(toString(str));

}
catch (IllegalArgumentException | InputMismatchException e) { // ��� catch ��������������� ��� '|' ����������.
	System.out.println(e + "Error");
	}
}
}

/*
��� ������� ��� IllegalArgumentException

��� ������ ��� ������� �� ��� ������ ��� ����� �� ������ � ����������.

*/