package com.kodilla.spring.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    public static void main(String[] args) {
        SpringApplication.run(ForumUser.class, args);
    }

    private String userName;

    public ForumUser() {                // inicjacja pola w konstruktorze "na sztywno"
        this.userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
