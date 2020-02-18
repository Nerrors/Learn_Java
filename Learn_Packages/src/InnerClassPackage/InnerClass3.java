package InnerClassPackage;

public class InnerClass3 {
	
	void my_Method() {
	     int num = 23; //******** ��� ���� final �����������. ��� ���� ����� ���� �� �� �������, �� �������� ���� ��� ���� ��� ��� �� ��� �����.
	     
	     //-----Inner Local Method-----\\
	     class MethodInner_Demo {   // method-local inner class
	         public void print() {
	        	 
	        	       //******** ��� ����������, ��� ��� �������� �� �������� num = 30;
	            System.out.println("This is method inner class "+ num);	   
	         }   
	      }    
	     //-----------------------------\\
	     
	      MethodInner_Demo inner = new MethodInner_Demo();
	      inner.print();     
	 } 
}

/*

��� inner-local-method ��� ��������� ���� �� access specifier/modifier (������ public � private),
���� ��� ������ ���� � outer ������� ���� ����� ���������.

��� �� ������ �������� �� ��� Inner-Local-Method �� ������ ���� Outer-Method ��� ��� ����������� �� 
�������������� ��� ����������� ��� inner ������ ��� �� ��������� ��� inner-local ������.

��� ����������, ��� �������� �� �������������� ����������� ��� Inner-Local-Method, ��� ��� ��� ������ (��� Outer) ��� ��� �����������.

���� ������� ������ ���� � ������� (��� ������ �����), ��� ���������� ������ �������� ��� ������ ��� Inner-Local-Method.

��� ���������� InnerClass1, ������������� ��� ����������� ��� inner ������, �� ��� ������ ��� Outer ��� ���� ���� main
�������������, ����������� ��� outer ��� �� ��������� ��� ������ ��� ��������� �� ����������� ��� inner.

*/