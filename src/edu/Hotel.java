package edu;

import java.util.Arrays;

public class Hotel {

    private Room[] rooms;
    private int stars;
    private String name;
    private void createRooms(){
        rooms[0] = new Room(1,3,5.500);
        rooms[1] = new Room(2,3,5.500);
        rooms[2] = new Room(3,3,5.500);
        rooms[3] = new Room(4,3,5.500);
        rooms[4] = new Room(5,3,5.500);
        rooms[5] = new Room(6,3,5.500);
        rooms[6] = new Room(7,3,5.500);
        rooms[7] = new Room(8,3,5.500);
        rooms[8] = new Room(9,3,5.500);
        rooms[9] = new Room(10,3,5.500);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                ", stars=" + stars +
                ", name='" + name + '\'' +
                '}';
    }



    public void addGuest(Guest guest) {
        createRooms();
        for (int i = 0; i < rooms.length; i++) {
//            rooms[i] = new Room(001,3,5.500);
            if (rooms[i].isEmpty()) {
                rooms[i].setBusy();
                guest.setRoom(rooms[i]);
                break;
            }
            if (guest.getRoom() == null) {
//              System.out.println(rooms[i]);
            }

        }

    }




    public void removeGuest(Guest guest){};

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


