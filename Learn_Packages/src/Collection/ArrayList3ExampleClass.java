package Collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayList3ExampleClass {

public static void main (String[] args) {
ArrayList<String> al = new ArrayList<String>();

al.add("Kwstas");
al.add("Angelikh");
al.add("Bibh");
al.add("Aleksandros");
al.add("Unknown");

//��������� �� index 3, ������ ��� ���������.
al.remove(3); 

//������� Unknown �� ��� ����.
al.set(3,"kiki");

//�� ������� �� element ���� ����� ��� ���������� true, ������ false.
boolean name = al.contains("Kiki");
System.out.println(name);

// ��� ��������� �� index ��� element.
int number = al.indexOf("Kwstas");
System.out.println (number);

// ��� ��������� �� element ��� index.
String str = al.get(0);
System.out.println (str);

// ��� ��������� �� ������� ��� ������.
int size = al.size();
System.out.println ("To megethos einai "+ size);

//al.clear(); ��� �� ������ ��� �� ������� ��� ������.

printSet(al);
}
public static void printSet(ArrayList<String> newal) { //�� ������ ����������� �� ����� static.
	
	int sizeofarray = newal.size();
		for (int position = 0; position<sizeofarray; position++) {
		System.out.println (newal.get(position));
		}
	}
}