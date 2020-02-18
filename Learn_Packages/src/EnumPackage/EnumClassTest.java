package EnumPackage;

public class EnumClassTest {

	public static void main(String[] args) {
		EnumClass ec;
		ec = EnumClass.Polygon;
		System.out.println(ec);
		
		System.out.println(EnumClass.Polygon.toString()); // �������� ��� ����.
		
		//-----------\\
		
		EnumClass ec2 = Enum.valueOf(EnumClass.class, "Polygon"); // ������ ��� ec2 �� EnumClass.Polygon.
		System.out.println(ec2);
		
		//-----------\\
		
		// ���� enumarated type ���� ��� static ������, ��� value() ��� ���������� ���� ������ �� ���� ��� �����.
	
		EnumClass [] ec3 =  EnumClass.values();
		for (int i=0; i<ec3.length; i++) {
			System.out.println(ec3[i]);
		}
		
		//-----------\\
		// �������� ��� ����������, �� ����������� constructors, methods ��� �����. ��� ����������:
		
		/*
		  
		  
		 
		  
		  
		 
		 */
		 */
	}
}
