package Io_Net;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.DataOutputStream;

public class ServerProg {

	public static void main (String[] args) {

	ServerSocket ssocket = null;
	int port = 6367;
	String s = null;

	try {
	ssocket = new ServerSocket (port);
	Socket socket = ssocket.accept();

	// �� ��� 2 �������� �������, ������������ �� �������.
	// ��������������� ��� ����� �������(PrintWriter, Scanner) �� ����� ��� ������� ��� ������� ��������.
	
	Scanner	isr = new Scanner (new InputStreamReader (socket.getInputStream()));
	PrintWriter dos = new PrintWriter (new DataOutputStream (socket.getOutputStream()));

	//��� �� ���������� �� ������ ��� ������� � Client.
	while (isr.hasNextLine()) {
	s = isr.nextLine(); // ���������� �� �������� ��� ��� client, ��� �� ������������ ���� ��������� s.
	System.out.println (s); // ���������� �� ������� ��� �� client, �� ����� ��� ��������, ��� �� ����������� ���� ����� ��� ���������� ��� (������, ��� �������).
	}

	dos.flush(); // ��� �� �������� �� �����. ������� ���� ��� �� Output.
	isr.close();
	dos.close();
	
	}
	catch (Exception e) {
	System.out.println("Error");	
		}
	}
}

/* ��� ���������� Clients.

while(true) {	
	Socket socket = serverSocket.accept();
	Thread thread = new ThreadClass(Socket);
	thread.start();
}
 */
	
