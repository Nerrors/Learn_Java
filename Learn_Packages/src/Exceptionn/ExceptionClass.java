package Exceptionn;

public class ExceptionClass extends Exception {
	public ExceptionClass () { // 1�� �������������.
		super ("Error_2"); // ��� �� ���������: Exception a = new Exception ("Error"); throw a;
	}
	public ExceptionClass (String message) { // 2�� �������������
		super (message); // ��� �� ���������: Exception a = new Exception ("Error"); throw a;
	}
	// �� ���  super ������� ����� ��� ������������.
}
