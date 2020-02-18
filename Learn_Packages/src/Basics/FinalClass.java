package Basics;

public class FinalClass {
	
	final int a= 30; // 1) �� ������ ����������� �� ����� static ����� �� ��������������� �� ��� static ������.
	
	/*
	int g;
	g = 50; �������� ���� ��� �������, ����� ��� � ����� ����� ���� ��� �������� ��� direct ��������������.
	 */
	
	/* ��� ���������� ���� �������� �� �� �������.
	 	int k;
	{
		k = 50;
	} 
	 */
	
	
	final int b; // 2) A blank final variable.
	{
		b = 50;
	}
	
	static final int c; // 3) A blank static final variable.
	static{
		c = 80;
	}
	
	final int d; // 4) Constructor for initializing
	
	public FinalClass(int d) {
		this.d = d;
	}
	
	
	public static void main(String[] args) {
		// a = 30;
		
		final int k; //�� �������� �� ����, ��� �������� �� �� ������� ����. 
		k = 30;
		
	}
}

/*
 * Final Variables ->  ��� �� �������������� ��������.
 * 
 * Final Methods -> ��� �� ����������� �� method overriding.
 * 
 * Final Classes -> ��� �� ����������� ��� ���������������.
*/