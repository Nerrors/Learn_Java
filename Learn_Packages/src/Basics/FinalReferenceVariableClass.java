package Basics;

public class FinalReferenceVariableClass {

	final static StringBuilder strb;
	static{
		strb = new StringBuilder("Greek");
	}
	
	public static void main(String[] args) {
		
	//	strb = new StringBuilder(); ��� ������� �� �� ������� ���� ��� ��� ������ INTIALIZE ��� FINAL ���������.
	
	// ��� ����������, ��� �������� �� �������� ���� ��� MAIN, 	final static StringBuilder strb; ��� ���� ���� ���� strb = new StringBuilder("Greek");
	// ����� �� ��� ��������� �������� ��� ��� ���� �������������.
	
	// ��� ���� �� ���� �������������� �� BRACKETS ��� ���� �� STATIC ��� �� ��� ������� ��� ���� ���� MAIN.
		
		System.out.println(strb);
		strb.append(" Greek2");
		System.out.println(strb);
		
	}
	
}

/*

 ��� ������� ��� Reference final variables � ��������� ��������� ��� object
 ��� ������������� ��� ���� �� reference ���������, ������ �� �������
 
 */