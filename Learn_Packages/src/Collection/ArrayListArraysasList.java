package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArraysasList {
	
	public static void main (String[] args) {
		
		String [] str = {"Kwstas", "Angelikh", "Bibh", "Aleksandros"};
		ArrayList <String> ar  = new ArrayList<> (Arrays.asList(str));
		//�������� ��� �� ����� ��� ����� �� ��������������� ��� �����.
		ar.add("Kai ena akomh onoma");
		
		System.out.println(ar);
	}
}