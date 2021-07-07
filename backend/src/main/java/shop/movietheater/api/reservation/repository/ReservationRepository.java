package shop.movietheater.api.reservation.repository;

import shop.movietheater.api.reservation.domain.Reservation;
import shop.movietheater.api.seat.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}