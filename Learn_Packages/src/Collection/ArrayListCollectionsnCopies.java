package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsnCopies {
	
	public static void main (String[] args) {
	
		ArrayList <String> ar  = new ArrayList<>(Collections.nCopies(6, "���� �����"));
	
System.out.println (ar);
	}	
}

// ��� collection, �������. � Collections ����� ����� ��� ��� interface.
// ���� �� ������� ��� �� ����� �������� (List EMPTY_LIST, Map EMPTY_MAP , Set EMPTY_SET) ����� static.
// ��������, �������� �� ��� ���������������� ���������� ���. Collections.<����� ��� �������()>.