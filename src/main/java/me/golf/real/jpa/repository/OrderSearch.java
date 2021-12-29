package me.golf.real.jpa.repository;

import lombok.Getter;
import lombok.Setter;
import me.golf.real.jpa.domain.OrderStatus;

@Getter @Setter
public class OrderSearch {

    private String memberName; // 회원 이름
    private OrderStatus orderStatus; // 주문 상태[ORDER, CANCEL]
}
