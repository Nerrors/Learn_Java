package Hotel_Example;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Hotel {
    private List<Reservation> reservations; // ������������ ��� ����� ��� ��������� �� ���� Reservation ������ ��� reservation ������ ���� ��� ����������� ��� ��� ������, ��� �� ����������, ��� ��� �� �������.
    private List<Room> rooms; // � Room ���� ��� ��� ����� Type ���� ��� ��� ����� reservation, ��� ������� �� ��� ����� ��� Period p ��� ����� ��������� �� �������.
    
    public Hotel() {
        reservations=new ArrayList<>();
        rooms=new ArrayList<>();
       
        Room r1 = new Room(RoomType.SINGLE);
        r1.setRoomNumber(100);
        rooms.add(r1);
        
        Room r2 = new Room(RoomType.DOUBLE);
        r2.setRoomNumber(200);
        rooms.add(r2);
        
        Room r3 = new Room(RoomType.SINGLE);
        r3.setRoomNumber(101);
        rooms.add(r3);
        
    }
    public Reservation makeReservation(Period period, Client client, RoomType roomType) {// ���� �������
        List<Room> r=roomsOfType(roomType); // �� ���� ���� ���������� �� Reservation (������ ��� ����������� ��� ��� ������, ������� + ����, ��� ��� �������).
        for (Room room : r) {
            boolean free = room.available(period);
            
           if (free) { // ��� ����� ���������
                Reservation newR = new Reservation(period,client,room); // ���� ������� // ���� ���� ��� �������. // ***** ����� ��� �� ������ public int test (int a, int b). Reservation re = new Reservation (a, b).
                reservations.add(newR);// �� ����������� ��� ���� �����.
                room.addReservation(newR);
                return newR;
            }
        }
        return null;
    }
    
    private List<Room> roomsOfType(RoomType roomType) {
        List<Room> rts = new ArrayList<>();
        for (Room r : rooms) {
            if (r.getRoomType()==roomType) {
                rts.add(r);
            }
        }        
        return rts;
    }
    
    //Reservation get ��� set.
    
    public void addReservation(Reservation r) {
        reservations.add(r);
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }
}

