package Exceptionn;
//Second Chance.
import java.util.Scanner;
public class Example_2 {
	int a; // ���������
	/* . ��� �� ��������� ���� �� ������� �� ������ ��� ���� ��� ���������� a (������ ���� ��� ��������������� ���� ����) 
	 * �� ������ �� ��� ��������� ������� ���� ��� ��� public class ���� ���� ������ 
	 * �� ��� ��������� ���� ������� ������ ��� �� ��� ����������� �� ��� ���������� ���� ��� ���������� b (������ ��� r)
	 */
	public static void main (String [] args) {
		
		Example_2 a = new Example_2 ();
		a.doit();
		// ���������. ���� �� �������� ���������� �����, ������������ ��� �������� ���� Main
	}
	
	
	public void doit() { // 1� �������
		try {
			Scanner keyboard = new Scanner (System.in);
			System.out.println("Enter the number of donuts");
			a = keyboard.nextInt();
			System.out.println("Enter the number of milks");
			int b = keyboard.nextInt();
		
		if (b<0) {
			throw new Exception ("Error");
		}
			double c = a / b;
			System.out.println(c);
		
		}
		catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("Please buy some milks");
			tryagain(a);
			}
		System.out.println("End program");
		}
	
	public void tryagain(int g) { // 2� �������.
		a = g;
		Scanner keyboard2 = new Scanner (System.in);
		System.out.println("Enter the number of milks again");
		int r = keyboard2.nextInt();
		int result = g/r;
		System.out.println(result);
		}
}
