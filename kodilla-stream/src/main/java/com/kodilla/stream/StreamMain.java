package com.kodilla.stream;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import static java.time.temporal.ChronoUnit.DAYS;  // do klasy DAYS

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("Unit 7 / Task 3");

        Forum theForumUser = new Forum();
        Map<Integer, ForumUser> mapa = theForumUser.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> DAYS.between(user.getDateOfBirth(), LocalDate.now()) >= 20)     // data 1 musi być mniejsza od 2  // https://stackoverflow.com/questions/27005861/calculate-days-between-two-dates-in-java-8
                .filter(user -> user.getNumbersOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, user -> user));


        System.out.println("Numbers of Users: " + mapa.size());
        mapa.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);



//        System.out.println();
//        System.out.println("Unit 7 Task 1");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("firstWord", (word) -> word + "ABC");
//        poemBeautifier.beautify("secondWord", (word) -> word.toUpperCase());      // metody Stringa:   https://stormit.pl/string-metody/
//        poemBeautifier.beautify("thirdWord", (word) -> "DEF " + word + " ABC");
//        poemBeautifier.beautify("fourthWord", (word) -> word.toUpperCase() + "*");
//        poemBeautifier.beautify("fifthWord", (word) -> word + "ABC");
    }
}

