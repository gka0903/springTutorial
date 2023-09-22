package hello.core_.discount;

import hello.core_.member.Grade;
import hello.core_.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        return 0;
    }
}
