package Test;

public class Test_1 {
	private String name;
	private int b;

	public Test_1 () {
		name = "No name yet";
		b = 0;
	}
	public Person (String newName) {
		name = newName;
		b = 30;
	}
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public String getName() { // First Method
		return name;
		}
	public void setName(String a) { //Second Method
		name = a;
		}
	public int  writeOutput () { // Third Method
		return b;
				}
	// � Person ��� ������ �� �������������� ��� ������ ��� Student_entend_Person � ��� Undergraduate_extends_Student.
	// �� ���������� �������.

	//�������: ������������ ���� getters, ��� setters ������, ��� ������� �� ������� ��� ��� ����������� �� ������ ��� ���������� ���� ���������� (���� ���� ��� ��������) �� �������� �� ��� abstract ������� ��� �� interfaces: (k = ��������� ��� interface) �� ���� ������ int k = b; � ���� main int k = <Interface_Name>.b;
	}
