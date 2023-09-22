package hello.core_;

import hello.core_.discount.DiscountPolicy;
import hello.core_.discount.FixDiscountPolicy;
import hello.core_.discount.RateDiscountPolicy;
import hello.core_.member.MemberRepository;
import hello.core_.member.MemberService;
import hello.core_.member.MemberServiceImpl;
import hello.core_.member.MemoryMemberRepository;
import hello.core_.order.OrderService;
import hello.core_.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
