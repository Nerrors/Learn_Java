package Hotel_Example;
import java.util.Date;

/**
 *
 * @author George
 */
public class Reservation { //������� 3 ���������� ��� 3 ������������ �������. ����� ��� �� �� ������������ ��� ����.
    private Period period; //*** ������ �� �� ����� ���� ��� �� ��� ������� ���������� ��� ���� ������. ��� ��� ���������� ��� ���� ������ �� ������ �� ������� import.�����_�������.�����_������.
    private Client client;
    private Room room;

    public Reservation(Period period, Client client, Room room) { // ���� Period period ������������ �� �������� ��� ������������.
        this.period = period;
        this.client = client;
        this.room = room;
        period.getStartDate();
    }
 // *** ������ �� ����� ��� ����� ����������������� �� ��� ����� ���� ��� ��� ���������� ��� ��� ����� ���������� ���� ����� ������.
    
    // ���� ����� Room ������������ ��� ����� List <Reservation> ������ ���� � ����� �������� �� �������� ��� ��� ��� Period ��� ��� Client ��� �� Room.

    
    public Client getClient() {
    	//period.getEndDate(); �������� �� �� ����������������.
    	//Date a = period.startDate; // �������� �� �� ���������������� ���� ���� � ��������� startDate ����� public.
        return client;
    }

    public Period getPeriod() {
        return period;
    }

    public Room getRoom() {
        return room;
    }

    public void setPeriod(Period period) { // ������� �� ����� ��� ��������. � ����� ����� �� ����� ��� ������ ��� �������� �� ����� ��� ����������.
        this.period = period;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
    // ��� ������ ��� ����������� ��� ������������� ��� Reservation ��� �� ����������� getters ��� setters.

    // ���� ����� � ���� ��������� �������. ��� ������ ��� ��������.
    public boolean overlaps(Period period) { // ���� ������������ �� ������ �� ���� �� ������.
        return this.period.overlaps(period);
    }

}
