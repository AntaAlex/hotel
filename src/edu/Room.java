package edu;

public class Room {
    private int numberOfRoom;
    private int capacity;
    private double price;
    private boolean isEmpty;
    public void setEmpty(){};
    public void setBusy(){
          isEmpty = true;
    }

    public Room(int numberOfRoom,int capacity,double price){
        this.numberOfRoom = numberOfRoom;
        this.capacity = capacity;
        this.price = price;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfRoom=" + numberOfRoom +
                ", capacity=" + capacity +
                ", price=" + price +
                ", isEmpty=" + isEmpty +
                '}';
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
