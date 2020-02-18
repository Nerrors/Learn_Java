package InnerClassPackage;

public class InnerClass4 {
	static int b = 50; //��� ���������� �� ���� ��� ��������� ��� ���� �������� � Inner �����. �� ������ �� ����� static.
	
	static void rrr() {
		System.out.println("sdfsdfsdfsfdsfd");
	}
	
	static class Nested_Demo {
		public void my_method() {
			int a = 50;
			b = 100;
			System.out.println("This is my nested class " + a + " " + b);
			rrr();
		
		/* ���� ���� �������� �� �� ������� ��� ������� �� ������ �������� ��� outer members (����� �� ����� static).
		
			InnerClass4 inn = new InnerClass4();
			return inn.b;
		
	    */
		}
	}
}


/*
 
������ ���� �� ���������� ������� ������� �� �������� static.

����� ��� static member ���� outer ������.

***�� �������� �� ��� ��������� inner �������, �� static inner classes ������� �� ����� static fields ��� methods.

������� ���� �� static members, ��� static nested �����, ��� ���� �������� ���� ���������� ��� ���� �������� ��� outer ������.
����� �� ����� static. 

�� static inner classes ��� �������� ��� ���������� (��� ��������) ���� Outer ������������.

*/