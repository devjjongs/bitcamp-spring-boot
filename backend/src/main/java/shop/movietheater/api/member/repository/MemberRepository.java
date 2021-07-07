package shop.movietheater.api.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.movietheater.api.member.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}