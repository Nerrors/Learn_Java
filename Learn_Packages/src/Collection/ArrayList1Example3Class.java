package Collection;

import java.util.ArrayList;

public class ArrayList1Example3Class {

	static ArrayList<String> ar;
	
	public static void main (String[] args) {	
		
		ar = new ArrayList<>(); // �� ��� �� ��������, �� ��� ������ error.
		addElement("How are you?");
		System.out.println(ar);
	
	}
	
	public static void addElement (String newstring) {
		ar.add(newstring);
	}
}

//***************
/* ��� �� ��� �� ������� ��� ����, � �������� ������� �����.
 * �� �������������� 2 �������, ���� � ��� �� ���� ��� �������� ��� � ���� �� ���� ��� main.
*/
