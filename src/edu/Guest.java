package edu;

public class Guest {
    private String name;
    private Room room;
    private boolean neighbor;
    private int budget;
    public void setRoom(Room room){
        this.room = room;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", room=" + room +
                ", neighbor=" + neighbor +
                ", budget=" + budget +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isNeighbor() {
        return neighbor;
    }

    public void setNeighbor(boolean neighbor) {
        this.neighbor = neighbor;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
