package lessons.summary1;

import java.util.Date;

public class Library implements ILibrary{

    private String section; //instance variable
    private String[] languages;
    private Book[] books;
    private Room[] rooms;

    @Override
    public boolean bookRoom(int roomNumber) {
        int someNumber = 2;//local variable
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                if (!room.isBooked()) {
                    room.setIsBooked(true);
                    return true;
                }
            }
        }
        return false;
    }

    public Room[] getRooms() {
        return rooms;
    }
}

interface ILibrary {
    boolean bookRoom(int roomNumber);
    Room[] getRooms();
}

class Room {
    private boolean isBooked;
    private int number;

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public int getNumber() {
        return this.number;
    }

    public boolean isBooked() {
        return this.isBooked;
    }
}

abstract class Book {
    private String language;
    private Date publishedAt;
}
