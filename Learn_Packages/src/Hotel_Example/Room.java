package Hotel_Example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Room {
    private List<Reservation> reservations; // ����������� �� ��� ����� ��� �� �������� ��� ���� ������� � ����� Reservation.
    private RoomType roomType; // ��������� ��� ��� ����.
    private Period p;
    private int roomNumber; // ��� ��� ������������� ���� ������������.
    
    public Room() {
        reservations = new ArrayList<>();  // ��� ����� ��� ������� �� ��� ����������.
        p.getStartDate();
    }
    public Room(RoomType roomType) {
        reservations = new ArrayList<>();
        this.roomType=roomType; // ���� �� roomType ��� ���� ������� ��� ������ (���� ��� ���� ����� Reservation (��� ���� ��� ������� Client, Room, Period).)
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservation(Reservation reservation) { // ��� ���� ������ ��� ������� �� ������ �� ������� �� 3 �����������.
        this.reservations.add(reservation); // � add ����� ��� ������� ��� ������.
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

  
    
    // ������� �������.
    
    public boolean available(Period period) {
        for (Reservation rsv : reservations) {
            if (rsv.overlaps(period)) {
                return false;
            }
        }
        return true;
    }
    
    
    
}
