package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    // zawierała listę użytkowników, czyli listę obiektów ForumUser.
    // udostępniać metodę getUserList(), która będzie zwracała kolekcję z użytkownika forum

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum() {
        theForumUsersList.add(new ForumUser(1, "Jan", 'M', 1991, 8, 17, 89));
        theForumUsersList.add(new ForumUser(2, "Andrzej", 'M', 2000, 1, 9, 100));
        theForumUsersList.add(new ForumUser(3, "Kasia", 'F', 1985, 8, 10, 20));
        theForumUsersList.add(new ForumUser(4, "Marek", 'F', 1997, 7, 23, 1));
        theForumUsersList.add(new ForumUser(5, "Agata", 'F', 1990, 8, 17, 4));
        theForumUsersList.add(new ForumUser(6, "Łukasz", 'M', 2016, 8, 17, 60));
        theForumUsersList.add(new ForumUser(7, "Mateusz", 'M', 1990, 8, 17, 89));
        theForumUsersList.add(new ForumUser(8, "Tomek", 'M', 2011, 8, 17, 1));
        theForumUsersList.add(new ForumUser(9, "Ania", 'F', 1990, 8, 17, 89));
        theForumUsersList.add(new ForumUser(10, "Jula", 'F', 2010, 8, 17, 89));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
