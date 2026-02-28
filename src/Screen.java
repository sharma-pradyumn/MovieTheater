import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Screen {

    // holds seatLayout and collection of shows.
    private HashMap<SeatId, Seat> seatLayout = new HashMap<>();
    private ArrayList<Screen> screenList = new ArrayList<>();

    public void addScreen(Screen s) {
        screenList.add(s);
    }

    public void addSeat(Seat seat) {
        if (seat == null || seatLayout.containsKey(seat.getSeatId())) {
            System.out.println("SeatId already taken");
            return;
        }
        seatLayout.put(seat.getSeatId(), seat);
    }

    public Seat getSeat(SeatId seatId) {
        return seatLayout.get(seatId);
    }

    public Set<SeatId> getAllSeatIds() {
        return seatLayout.keySet();
    }
}
