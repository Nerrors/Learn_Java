package PolymorphismAndDynamicBinding;

public class Person {

	private String name;
	//***** ��� private ��������� ������ �� ���� �� ��� public ������ (��� ����������, get ��� set ��������).
	
	
	public Person() {
		name = "No name yet";
	}
	public Person(String name) {
		this.name=name; // ��� ��� ������ ��� ������� �� this, �������� ��� ������������ �� Implicit ���������.
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String alex() {	
		return name;
	}	
}
