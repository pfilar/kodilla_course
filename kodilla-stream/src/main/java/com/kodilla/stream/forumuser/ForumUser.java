package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueUserId;
    private final String userName;
    private final char sex;         // 'M' / 'F"
    private final LocalDate dateOfBirth;
    private final int numbersOfPosts;

//    int year = dateOfBirth.getYear();
//    int month = dateOfBirth.getMonthValue();
//    int day = dateOfBirth.getDayOfMonth();

    public ForumUser(final int uniqueUserId, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numbersOfPosts) {
        this.uniqueUserId = uniqueUserId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbersOfPosts = numbersOfPosts;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}
