package Recursion;

public class NumberCount {
	static int count = 0;

    public static void main(String[] args){

   int a = 66456456;
   System.out.println (measure(a));
}
    
    public static int  measure(int a) {
         if (a <= 0 ) {
            return count;  // ���� �� count �� �������������� �� ���� 0.
        }
        else {
           count++;
           return measure (a/10); // ���� ������ ��� 0, ���� ����� ��� ����� return �� count;
        }
    }
}

/* ������� ��� RECURSION
 * 
 * �� ������ ����������� �� ������ ��� ������� ��� �� ���������� ��� ����� ��� ����������.
 * 
 * ���� ���� ��� �� �������������� � ��������� �� ������ ��/� ������/��� ��� �� �������� ����, ��� �� ������ ���� ������� ��� �� ���������� � ��������.
 * 
 */
