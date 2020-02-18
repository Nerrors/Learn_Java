package Basics;

public class MathClass {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 50) + 1; // Casting �� �� int.
			System.out.println("� ������� ������� ���� ��� ���� ����� = " + n);
		}
	}
}

		// ���� ���������� ��� ���������� �� ��� ������� import.


		/*  
		 * ----------------------------------------------------
		 *  O���� ->  ���������    ->    ����������           |
		 * ----------------------------------------------------
		 * 
		 * pow     | ������            |Math.pow (2.0, 3.0);  | 
		 * 
		 * abs     | ������� ����      |Math.abs (-3.5);      |
		 * 
		 * max     | �������           |Math.max (5.5, 5.4);  |
		 * 
		 * min     | ��������          |Math.min (5.5, 5.4);  |
		 * 
		 * random  | ������� �������   |Math.random ();       |
		 * 
		 * round   | ���������������   |Math.round (6.3);     |
		 * 
		 * ceil    | ��� ����          |Math.ceil (3.2);      |
		 * 
		 * floor   | ���� ����         |Math.floor (3.2);     |
		 * 
		 * sqrt    | ������������ ���� |Math.sqrt (4.0);      |
		 *
		 * ----------------------------------------------------
		 *  
		 * �������: 
		 * 
		 * � random ������ double �� ���� ����������, � round (���� ����� ��� ������) int, long ���
		 * � pow, ceil, floor, sqrt � ����� �������� ���� ����� ����� double ��� ����������� ����� double.
		 * 
		 * double a = 3.24;
		 * int lowAnswer = (int) Math.round (a);
		 
		 */