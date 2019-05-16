package com.kodilla.good.patterns.challenges.CarRental;

public class UserOfRental {
    private String userLogin;
    private String userName;
    private String userSurname;

    public UserOfRental(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
}
