package Collection;

import java.util.ArrayList;

public class ArrayList1Example2Class {
	
	static ArrayList<Integer>  ari; //***** �� ������ ����������� �� ����� static. ����� ������������ �� ���� ��� ��������� �� ��� static ������. ��� ��� ���� �� ������ �� ����� static.
								    //***** ��� ����������� ��� ���� ��� ��������� (��� ��� ���������� ���� ���� main), ��� �� ������ ��� � ���� ������� �� ��� ��������.
	public static void main (String[] ars) {
		
	ari = new ArrayList<>();
	ari.add(10);
	ari.add(560);
	ari.add(56);
	ari.add(10234);
	
	ari.remove(0); // To 0 ����� � index.
	ari.remove(Integer.valueOf(10));
	//ari.remove(String.valueOf("Stringname")); ��� ����� String.
	
	
	//����� �� ����� �� �������, �������� ������ index.
	
	//hsi.set(2, 7);
	//hsi.get(2);
	//hsi.remove(2);

	getSet3();
}
	
	public static void getSet3 () { // *****�� ������ ����������� �� ����� static. ����� ������� ������� ����� ��� �������, �� ��� ������ (��� main) ��� ����� ��'������� static.
	Object[] obj = ari.toArray();   //***** �������� ��� �� �� ���������� ��� ����, �� ��� ��������� ������, ��� �� ������� ��� ������� ���� ���� main.
	for (Object objs : obj) {
		System.out.println(objs + " ");
	}
}
}

//������..

//����� ���� ���� ���� main ������������ �� ��� ������ ���� ������������, ��� ��� ����� static (� �������) ��� ��� ������ ������?