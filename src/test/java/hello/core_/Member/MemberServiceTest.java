package hello.core_.Member;

import hello.core_.AppConfig;
import hello.core_.member.Grade;
import hello.core_.member.Member;
import hello.core_.member.MemberService;
import hello.core_.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();

    }

    @Test
    void join(){
        //given 이런게 주어졌을 때
        Member member = new Member(1L, "MemberA", Grade.VIP);

        //when 이럴 때
        memberService.join(member);
        Member findMember = memberService.findMember(member.getId());
        //then 이렇게 된다
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
