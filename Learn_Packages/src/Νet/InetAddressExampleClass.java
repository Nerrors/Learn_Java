package �et;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExampleClass {

	public static void main (String [] args) {
		
		try {
			
		InetAddress inet1, inet2;
		InetAddress [] inet3;
		
// � ������� getByAddress(byte[] addr), getByAddress(String host, byte[] addr), getAllByName(String host), getByName(String host),����������� static InetAddress.
		
	// getByName -> ��������� ��� ��������� IP ���� ��������� ����������.
	// getHostAddress -> ���������� �� ������������ ���������� IP �� ���������� ��������.
	
	 
	// ������ IP, ��� ��� �������� DNS/Hostname.	
	inet1 = InetAddress.getByName("www.codejava.net");
	 System.out.println(inet1.getHostAddress());
	 
	 
	 // ������ Host ��� ��� IP ���.
	 inet2 = InetAddress.getByName("8.8.8.8");
	 System.out.println(inet2.getHostName());
	 
	 //���������� ������ �� ���� ��� IP �����������, ��� ����������� �� ���  DNS/Hostname.
	 inet3 =InetAddress.getAllByName("google.com");
	 for (InetAddress addr: inet3) {					// ������� �� ���� ��� for.
		 System.out.println(addr.getHostAddress());
	 }
		
		}
		catch (UnknownHostException e) {
			System.out.println("Error");
			
		}
	}
}
