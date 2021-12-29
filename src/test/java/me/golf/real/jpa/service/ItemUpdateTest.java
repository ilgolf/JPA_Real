package me.golf.real.jpa.service;

import me.golf.real.jpa.domain.item.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired EntityManager em;

    @Test
    void updateTest() {
        Book book = em.find(Book.class, 1L);

        // TX
        book.setName("asdasda");

        // 변경감지 : 더티 체킹
        // TX Commit
    }
}
