package PolymorphismAndDynamicBinding;

public class Undergraduate {

	
	public static void main(String[] args) {
		
		Person p = new Person("Aleksandros");
		Person s = new Student("George ", 20); // ��� ���� ���� �� ���� �� �������. ��� �������� ����������.

		System.out.println(p.alex());
		System.out.println(s.alex());
	
	
	/*
	
	 � �������������, ���������� ���� ���������� �� ������������ ������ �������� �� ��� ����� ������� 
	 ���� ��� ���������� ��� ���������  ����������� (dynamic binding).
	 
	 */
	
	/*
	 
	 ��� ��� ��������, ���� �������� ��� ������������ ������, � �������� ��� ���������� 
	 ����� ���� ��� �������� ���� ����� ��� ��������������� ��� ��� ���������� ��� ������������
	 (���. new Student). ��� ��������� ������ ��� ��� ���� ���� ��� ��� ����� ��� ������������.
	 
	 */
	
	// ��� ������� ��� toString(), � Java ������������ �������� ���������� �� ���� ��� ������.
	}
}
