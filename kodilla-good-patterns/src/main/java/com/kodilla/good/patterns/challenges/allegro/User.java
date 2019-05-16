package com.kodilla.good.patterns.challenges.allegro;

public class User {
    private String login;
    private String Name;

    public User(String login, String name) {
        this.login = login;
        Name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return Name;
    }
}
