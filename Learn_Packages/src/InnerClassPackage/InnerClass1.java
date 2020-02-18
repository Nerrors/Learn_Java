package InnerClassPackage;

class Outer_Demo {
   int num;
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }  
   
   
   // inner class
   private class Inner_Demo {
	   
	   public void print() {
       System.out.println("This is an inner class" + num);
      }
   }
}


/*

������ ���� �� ���������� ������� ������� �� �������� private � protected. ��� ���� �� ����� ��� �������� ��� static.

��� ��� ��������� ������� ���� �������� �� ��� ������ ��� ��������� ���� ���� ��������� �����,
���� ��� ������� ��� ����������� ��� ������.

��� ��� ������ ��� � inner ����� ��� ����� static, ��� ������ �� ���� static fields ��� methods.

*/