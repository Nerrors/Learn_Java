package Recursion;

import java.util.Scanner;

public class StringLength {
	static int count = 0;
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("���� ��� String");
		String str = sc.nextLine();
		System.out.println (fibbonaciiMethod(str));
	}

	public static int fibbonaciiMethod (String newstr) {
		  
		 if (newstr.length() <= 0)
		        return count;
		    
		 else {
		    count++;
		      return fibbonaciiMethod(newstr.substring(0, newstr.length()-1)); //�� ��������� ��� ������������ �� ���� ��������� ��������.
		 }
	}
}

/* �������������� ��� ������� �� 0.
 * 
 * ��������������� ��� ������.
 * 
 * ���� ���� ��� ������ � ������� � �������� �������.
 * 
 * �� ���������� ���� ���� �� ����� ��� ������������� �� ����� <= ��� �� ����� ���.
*/