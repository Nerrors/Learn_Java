package Io;

public class IO_Theory {

}

/*
			��� ������� ��� ��������.

� root ����� Object ��������� �� 2 �������:
Input Stream ��� OutputStream

� ����� InputStream (abstract) ��������� ��:
FileInputStream, FilterInputStream, ObjectInputStream.

� ����� OutpuStream (abstract) ��������� ��:
FileOutputStream, FilterOutputStream, ObjectOutputStream.

���������� �� ������� FilterInput/OutputStream ���������� ��� ����� ��:
DataInputStream, DataOutputStream
BufferedInputStream, BufferedOutputStream

��������: �� ����������� ��� ����  �������:
File, PrintWriter, Scanner, FileReader, FileWriter, Reader, Writer

			��� ������� �� Exceptions:
			
�� ���������� ����� �� ����:
FileNotFoundException, IOException, EOFexception, ObjectStreamException, UTFDataFormatException

			��� ������� ��� �������� ��� ���������� ���� ������� InputStream ��� OutputStream
			
�������� �� ������� InputStream ��� OutputStream, ��������� ��� ����� AutoClosable ��� �������� �� ���������������� ��� ��� ������ .close() � ����� ������� ���� ����. 
			
InputStream:

close() : void
available() : int
mark (int readlimit) : void
read() : abstract int, int
read(byte[] b) : int
reset() : void
skip() : long

OutputStream:

close() : void
flush() : void
write(byte[] b) : void
write(int b) : abstract void

*/