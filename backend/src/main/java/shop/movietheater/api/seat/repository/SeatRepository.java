package shop.movietheater.api.seat.repository;

import shop.movietheater.api.seat.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository  extends JpaRepository<Seat, Long> {
}