import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

public class Show {
    // has movie, timeShown, SeatStatus for each seat for that show, PricingStratergy

    private final LocalDateTime startTime;
    private final Movie movie;
    private ConcurrentHashMap<SeatId, SeatStatus> seatStatusMap = new ConcurrentHashMap<>();
    private final Screen screen;
    private final PricingStratergy pricingStratergy;

    public Show(Movie _movie, LocalDateTime _startTime, PricingStratergy _pricingStratergy, Screen _screen) {
        movie = _movie;
        startTime = _startTime;
        screen = _screen;
        for (SeatId seatId: screen.getAllSeatIds()) {
            seatStatusMap.put(seatId, SeatStatus.AVAILABLE);
        }
        pricingStratergy = _pricingStratergy;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return startTime.plus(movie.movieDuration());
    }
}
