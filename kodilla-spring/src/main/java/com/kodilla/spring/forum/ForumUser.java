package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

    public ForumUser() {                // inicjacja pola w konstruktorze "na sztywno"
        this.userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
