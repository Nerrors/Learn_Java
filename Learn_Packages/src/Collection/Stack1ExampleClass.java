package Collection;

import java.util.Stack;

public class Stack1ExampleClass {

	
	public static void main (String[] args) {
		
		Stack<String> st = new Stack<>();
		
		
		st.push("Jack");
		st.push("Alex");
		st.push("Tommy");
		st.push("Aris");
		st.push("John");
		
		System.out.println(st);	
	System.out.println(st.pop());
	}
	
	// � Stack ���������� ��� Vector ��� ���������� ���� �� ��� ArrayList ��� ��� LinkedList ��� AbstractList.
	
	//�� �������� �� ��� ����� Queue:
	// ���� ������������.
	
	/* ���� ��� ���� �������� ��������:
	 * 
	 * empty() : boolean        
	 * pop() : E                -> ���������� ��� ������� �� ��������� �������� ��� �������.
	 * push() : E               -> ��������� ��� ��� �������� ���� ������ ��� �������.
	 * search(o : object) : int -> ���������� ��� ���� ���� ������������� ���������.
	 * 
	 * 
	 * ��� ���� ��� ���� ��������
	 * 
	 * offer
	 * poll
	 * element
	 * 
	 */
	
	
	
	
}
