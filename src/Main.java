import edu.Guest;
import edu.Hotel;
import edu.Room;

public class Main {

    public static void main(String[] args) {
        Hotel hayat = new Hotel();
        hayat.setName("Hayat");
        hayat.setStars(4);
        hayat.setRooms(new Room[10]);

        Guest batman = new Guest();
        batman.setName("Bruce");
        batman.getRoom();
        batman.setBudget(5000);
        batman.setNeighbor(false);

        hayat.addGuest(batman);

        System.out.println(batman);
    }
}
