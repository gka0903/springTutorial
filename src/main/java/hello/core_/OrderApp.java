package hello.core_;

import hello.core_.discount.RateDiscountPolicy;
import hello.core_.member.*;
import hello.core_.order.Order;
import hello.core_.order.OrderService;
import hello.core_.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);
        Order testOrderService = orderService.createOrder(member.getId(), "ItemA", 100000);
        System.out.println("testOrderService = " + testOrderService);
    }
}
