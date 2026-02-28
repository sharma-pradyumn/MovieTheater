public class Seat {
    private final SeatId seatId;
    private final SeatType seatType;

    public Seat(SeatId _seatId, SeatType _seatType) {
        seatId = _seatId;
        seatType = _seatType;
    }

    public SeatId getSeatId() {
        return seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

}
