package Io_Net;

import java.io.PrintWriter;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.DataOutputStream;

import java.net.Socket;

public class ClientProg {

public static void main (String[] args) {

//��������� ������� ��������������.

int port = 6357;
String ipaddress = "192.168.1.12";

// ������ �� ������ �� ��������� �� �������, ���� ��� ������ �� ��������� ��� �� ���������� ��������.

try {
Socket socket = new Socket (ipaddress, port);
Scanner isr = new Scanner (new InputStreamReader (socket.getInputStream())); // �� ���� ��� ������, �������� ���� ���� ����� ��� �� socket, �� �������������� ���� �� ����� ��� ��� �������� ���������.
PrintWriter dos = new PrintWriter (new DataOutputStream(socket.getOutputStream())); // ����������, �� ���� ��� ������, �������� �� ����� ��� �� �������������� ��� ��� �������� ���������, ��� Socket.

// ���� ������ �� �������, �� ������ �� ������ ��� ������ ���� server, ���� ��� ��������.
//��� ���� �� �� ���� ���� ��� �������� ������.

dos.println ("�� ������ ��� ������"); // ��� ���� ��������� ������� ����� ���, ��� ��������������� �� System.out.println, ���� �� dos.println, ���� ��� ������� �� �������� ���� ����� ��� ���������� (������ ��� System) ���� ��� �����.

dos.flush();
dos.close();
isr.close();

  }
catch (Exception e) {
	System.out.println("Error");	
}
}
        }