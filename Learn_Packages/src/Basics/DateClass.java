package Basics;

// �� ������ �� ��������� ��� � Calendar ����� ��� abstract �����.

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Calendar;

public class DateClass {

	public static void main(String[] args) {

		int Hour, Minutes, Seconds;

		Calendar cal; // ����� ��� ����� new?
		cal = Calendar.getInstance(); // ������� ���� � ������� ��� ���������� static Calendar.

		Hour = Calendar.HOUR;
		Minutes = Calendar.MINUTE;
		Seconds = Calendar.SECOND;

		// �������� � get ������� �� ������ get(int field);

		System.out.println(cal.get(Hour) + ":" + cal.get(Minutes) + ":" + cal.get(Seconds));

		Formatter form = new Formatter();
		Formatter a = form.format("%tB", cal);
		System.out.println(a);

		//------------------------------------//

		Date date = new Date();
		System.out.println(date);
		System.out.format(date + " %tB", cal);

		SimpleDateFormat formats = new SimpleDateFormat();
		System.out.println(formats.format(date)); // .format(������ Date)

		System.out.println(cal.getTime()); // ���������� Date;
	}
}