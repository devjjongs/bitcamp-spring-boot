package shop.movietheater.api.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import shop.movietheater.api.member.repository.MemberRepository;
import shop.movietheater.api.member.domain.Member;

@Log4j2
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void signUpMember(Member member) {

    }

    @Override
    public Member viewMember(String memberID) {
        return null;
    }

    @Override
    public void modifyMember(Member member) {

    }
    @Override
    public void deleteMember(Member member) {

    }
}