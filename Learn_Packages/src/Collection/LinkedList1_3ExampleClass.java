package Collection;

public class LinkedList1_3ExampleClass {

public static void main (String[] args) {
	
	LinkedList1_2Example_Class lm = new LinkedList1_2Example_Class();
	lm.addElement("����������");
	lm.addElement("��������");
	lm.addElement("������");
	lm.addElement("����");
	
	System.out.println(lm.length());
	lm.showList(); // ���� ���� ������ showList, ���������� � ������: System.out.println(position.getData());
				   // ���� getData(); � ������� ���� ����� LinkedList1.
	System.out.println();

lm.removeElement();
lm.showList(); 

lm.removeAllElements2();
System.out.println("�� nodes ����� ��: "); // ����� ��� ����������
//lm.showList(); 

}

}
