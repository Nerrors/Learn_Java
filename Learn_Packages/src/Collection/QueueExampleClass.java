package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleClass {

	public static void main (String[] args) {
		
		
		Queue<Integer> q = new LinkedList<>();
		
		for (int i=1; i<=5;i++)
			q.add(i); // ��� ��������� q.add(new Integer(i))
		
		System.out.println(q);
		
		System.out.println(q.peek()); // ������ �� �������� ���� ������ ��� ����� ��� �� ����� ����� � ����, ���������� null.
		System.out.println(q.element()); // �� �������� �� ��� peek, �� ����� null ������ ��� ��������.
		System.out.println(q.poll()); // ������ ��� ������� ���� ������ ��� ���������� null �� ����� ����.
		System.out.println(q.remove()); // � ���� ���������� �� ���� ���� ������ ��� ��������.
		System.out.println(q);
		System.out.println(q.size());
	} 
	
	//��� ���� ������� ������������. ����� interface.
	//� LinkedList ���������� ��� ������� Deque ��� ���������� ��� Queue.
	//� PriorityQueue ���������� ��� AbstractQueue ��� ���������� ��� Queue
	//NullPointerException.
	
}
