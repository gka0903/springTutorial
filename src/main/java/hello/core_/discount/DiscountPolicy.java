package hello.core_.discount;

import hello.core_.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);

}
