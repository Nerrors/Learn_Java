package Conversions;

public class StringToOtherTypes {
	
	public static void main (String[] args) {
		
		String a = "20";
		String f = "HelloWorld";
		int b = Integer.parseInt(a);
		double g = Double.parseDouble(a);
		char[] alex = f.toCharArray();
		
		System.out.println(b);
		System.out.println(g);
		System.out.println(alex[1]); //��� ������� �� ����������� ��� �� char, ��������������� ��� for.
		
	//��� ���� ��� ���� ������ ��� String, ������� ������������, �� ��� ������ error.
	
	//���� ����� ������ ����� ��� �� ����� ��� ������� valueOf();
		
		String y = "20";
		int p = Integer.valueOf(y);
		System.out.println(y);
	}
	
	//****** � parseInt ��� � valueOf ����� static, ��� ���� �������� �� ��� �������� ����.
}

