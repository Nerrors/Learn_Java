package Basics;


public class StringMethods {

	public static void main (String[] args) {
		String a = "���� ��� �� ������";
		String b = "���� �����";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println ("-----------------------------");
		
		//Boolean
		
		if (a.isEmpty() == false) {
			System.out.println("�� String a ��� ����� �����");
		}
		
		if (a.equals(b) == true) { // ����� ������� �� ���� ��� ��������� �� ==true. ��������� ���� ��� ������������ �� ��� ����������� ����������� (Object object);
			System.out.println("�� String a ����� ���� �� �� b.");
		}
		if (a.matches("�� ���� ��������� �� �� String a")) {
			System.out.println("�� ���� ��������� �� �� String a");
		}
		if (a.endsWith("�")) { // ����� string.
			System.out.println ("� ������������ a ��������� �� ��� ������������ �");
		}
		if (a.startsWith("����")) { // ����� string.
			System.out.println ("� ������������ a ������� �� ��� ������������ ����");
		}
		if (a.startsWith("���", 2)) { // �� ����� ��� ������ �������� �� �������� ��� ��� offset.
			System.out.println ("� ������������ a ������� �� ��� ������������ ����");
		}
		
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.replace('�', 'c'));
		System.out.println(a.replaceAll("����", "�� ������"));
		
		// int
		
		int c = a.length(); // �� �������������� ���� ��� for.
		int h = a.hashCode();
		System.out.println ("�� ����� �����" + c + " �� Hash code �����" + h);
		
		int l = a.compareTo(b); // ������� ��� ���������� ���� Interger ����.
		int l2 = a.compareToIgnoreCase(b);
		System.out.println("To l ����� " + l + " �� l2 ����� " + l2);
		
		// char[]
		
		char [] ar;
		ar = a.toCharArray();
		for (int i =0; i <ar.length; i++) { // ��� �������� �� ���������������� ��� ������ .length() ������ �������� ���� String arrays.
			System.out.print (ar[i]);
		}
	}
}