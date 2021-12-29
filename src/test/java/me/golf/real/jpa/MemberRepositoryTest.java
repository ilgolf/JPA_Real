package me.golf.real.jpa;

import me.golf.real.jpa.domain.Member;
import me.golf.real.jpa.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    void testMember() {
        // given
        Member member = new Member();
        member.setName("memberA");

        // when
        memberRepository.save(member);
        Member findMember = memberRepository.findOne(member.getId());

        // then
        assertThat(member.getId()).isEqualTo(findMember.getId());
        assertThat(member.getName()).isEqualTo(findMember.getName());
        assertThat(findMember).isEqualTo(member);
    }
}