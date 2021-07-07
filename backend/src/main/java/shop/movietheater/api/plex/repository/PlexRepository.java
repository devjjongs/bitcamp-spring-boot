package shop.movietheater.api.plex.repository;

import shop.movietheater.api.plex.domain.Plex;
import shop.movietheater.api.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlexRepository extends JpaRepository<Plex, Long> {
}
