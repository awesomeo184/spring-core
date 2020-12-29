package hello.core.discount;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인")
    void when_vip() {
        // given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(memberVIP, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("일반 고객은 할인이 적용되지 않음")
    void when_basic() {
        //given
        Member memberBASIC = new Member(2L, "memberBASIC", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(memberBASIC, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}