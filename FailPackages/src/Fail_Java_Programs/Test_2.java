package Fail_Java_Programs;

import java.util.List;

import Basics.Test;

import java.util.ArrayList;

public class Test_2 { //������� 3 ���������� ��� 3 ������������ �������.
	// ������ �� �� ����� ���� ��� �� ��� ������� ���������� ��� ���� ������.
    private Test test;
    private int number = 10;
    private List<Test> r;
    
    public Test_2(Test test, int number) {
       r = new ArrayList<>();
    	this.test = test;
        this.number = number;
    }
    
    // ���� ����� Room ������������ ��� ����� List <Reservation> ������ ���� � ����� �������� �� �������� ��� ��� ��� Period ��� ��� Client ��� �� Room.

    public Test getClient() {
    	return test;
    }

    public void setClient(Test test) {
        this.test = test;
    }
    
    public List<Test> rr () {
    	return r;
    	
    }
    
    public static void main (String [] args)
    {
    Test a = new Test ("jhkjh", "ljhkjh");
    
	
	Test_2 b = new Test_2 (a, 30);
	Test_2 c = new Test_2 (new Test ("dsada", "DASDASD"), 20);
    
    	System.out.println(a.getName());
    	
    	System.out.println(a.get(a)); // ������ � ������� ����� : get(Test t).

  System.out.println(b.rr());// �����
    //System.out.println (b.setClient(new Test ("jihihj", "knbjhg")));
    }
}