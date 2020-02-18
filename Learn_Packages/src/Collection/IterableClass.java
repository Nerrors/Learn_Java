package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableClass {
	/* ****��� ������� ����� ����� Iterable. �������� �� ���������������� ��� ����������� Iterator ��� �� ����������� ��� �� �������� ��� ��������.
	 * 
	 * �� Interface Iterator ����� ��� ������� ���������� ��������� ���� ����� ���������,
	 * ����� �� ����� ���������� �� �������� ��� ����� ����������� ��� ���������.
	 * 
	 * � ������� iterator() ��� �������� Interable ���������� ��� ����������� ����� Iterator.
	 * 
	 */
	
	public static void main (String[] args) {

	ArrayList <Integer> ari = new ArrayList<>();
	
	ari.add(10);
	ari.add(560);
	ari.add(56);
	ari.add(10234);
	
	Iterator<Integer> iter = ari.iterator();
	while (iter.hasNext()) {
		System.out.println(iter.next());
		
	}
	}	
}
