package Collection;

import java.util.Vector;

/* � ����� Vector, ����� �������� �� ��� ArrayList �� ��� ������� ��� �������� ��������������
 * �������� ����������� ��� ������������ ��� vector.
 * 
 * �� �������������� �������, ���������� ��� ���������� ��� ���������, ���� ��������������� ���
 * �������������� ��� ��� � ����������� ������.
 * 
 * 
 */

public class VectorExampleClass {

	public static void main (String[] args) {
		
		Vector<String> vec = new Vector<>(20);
		
		vec.addElement("dsfsdf");
		vec.add("dsfsdf");
		
		System.out.println(vec);
	}
	
}
