package Basics;

public class StringMethods2 {

	public static void main(String[] args) {
        
        String s1 = "���� ��� �� ������?"; // � String ����� �������� �����. ��� �������� ��� �������� ��������. ��� ���� ������� ��� ������� �� �����.
        String s2 = "���� ����� ���?";
        
        System.out.println(s1 + s2);
        System.out.println(s1.length()); // �������. � ������� length �����, ����� ��� �� ��������� �� ������� ���� array.
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim()); // ����� ��� �� ���� ��� ��� ������������.
        
        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2));
        
        System.out.println(s1.contains("����"));
  
        System.out.println(s1.replace('�', '�'));
        System.out.println(s1.replaceAll("����", "�� ������"));
        
        System.out.println(s1.hashCode());
        
        System.out.println(s1.substring(0, 3)); // �� ��������� �� ���.
     
      // System.out.println (s1.startWith("�"));
      // System.out.println (s1.endWith("?"));
       
		char[] ar;
		ar = s1.toCharArray();
		for (int i =0; i <ar.length; i++) { // ��� �������� �� ���������������� ��� ������ .length() ������ �������� ���� String arrays.
			System.out.print(ar[i]);
		}
   }
}