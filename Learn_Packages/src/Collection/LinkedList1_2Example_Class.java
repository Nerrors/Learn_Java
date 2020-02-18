package Collection;

public class LinkedList1_2Example_Class {

LinkedList1_1ExampleClass header;
	
// ��� �� ����������� ��� ����������� �����.	
	public void showList() {
		LinkedList1_1ExampleClass position = header;
			while (position != null) {
				System.out.println(position.getData()); // � getData ��� � getLin�, ���������� ���� ����� LinkedList1_1
				position = position.getLink();
}	
	}
	
// ��� �� ����������� �� ������� ��� ������������ ������.
	public int length() {
		int count = 0;
		LinkedList1_1ExampleClass position = header;
		while (position != null) {
			count++;
			position = position.getLink();
	}
		return count;
		}
	
// ��� �� ����������� ��� �������� ���� ����������� �����.
	public void addElement (String a) {
		header = new LinkedList1_1ExampleClass (a ,header); //*** ��� ���� ��� ���� ����, ��� � LinkedList ����� ��� ������� ������������.
	}
	
// ��� �� ����������� ��� �������� ���� ����������� �����.
	public void removeElement () {
		if (header != null)
		{
		header.getLink(); // ���� ����������� ��� header, ��� ���� �������. ��������� �� element.
		}
		else {
			System.out.println ("Deleting from an empty list.");
			System.exit(0);
			}
	}
	
// ��� �� ����������� ��� �� nodes.
	public void removeAllElements () {
		for (int i = 1; i<length(); i++) {
			header.getLink();
	}
}
	
	// ��� ����� ������ ������. ��� ���� ����� ����.
	public void removeAllElements2 () {
		while (header!=null) {
		header = header.getLink(); // ��� ��� ���� position.getLink() ������������
	}
}
	
	public void showList2() {
		LinkedList1_1ExampleClass position = header;
		for (int i = 0; i<length(); i++) {
			System.out.println (position.getData());
			position = position.getLink(); // ����� ����� ��� ����� ���� position.getLink(); �������.
}	
	}

}
	
// ��� ��� ��������������
	
