package Collection;

import java.util.HashSet;

public class HashSet1ExampleClass {

		public static void main (String[] args) {
		
		HashSet<String> hsi = new HashSet<>();
		
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		hsi.add("hkgjhg");
		
		//***������ ��� ������� ������ standard �����, ��� ������� ��� �� �������� ������� ��� ����������� �� indexes.
		
		//hsi.set(2, 7);
		//hsi.get(2);
		//hsi.remove(2);
		
		//�� ����� ��� �����, �������� �� ����������� ��� ��������.
		hsi.remove(String.valueOf("hkgjhg"));
		// ���� ��� ������ ��� ������ ������� ���� ������ �� ������������ ��� String �� int ����. ���� ����� ������ ����� �� ���������������� ��� ������ intValue();
		
		System.out.println(hsi);
		}
	}
