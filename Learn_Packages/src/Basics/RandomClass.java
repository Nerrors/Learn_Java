package Basics;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random numbers = new Random();
		int n = numbers.nextInt(49) + 1; // ���� ��� �� Scanner in ...in.nextInt();
		System.out.println(n);
	}
}

// ����� ������ (����� ��� ����� ��� ������ Random) ����� �� ����:

/*

double random = Math.random() * 49 + 1;
�
int random = (int) (Math.random() * 50 + 1);

*/