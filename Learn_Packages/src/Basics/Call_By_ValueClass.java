package Basics;

public class Call_By_ValueClass {
	int a = 20;

	public void change (int a) {
		//this.a = a; // ������ �� this, ����� ��� implicit �����������.
		a += 20;
	}
	
	public void change2 () {
		a += 40;  //*****���� ������ �� ��������. ��� �� ����� 20 + 40 = 60.
	}
	
	
	public static void main(String[] args) {
		Call_By_ValueClass call = new Call_By_ValueClass();
		System.out.println (call.a);
		call.change(500);
		System.out.println (call.a);
		
		// ��� ��� ������� �� �� Call By Value.
	    //*****�� ������� �� ����������� ��� ������ this.a = a;
		
		call.change2();
		System.out.println(call.a);
	}
}