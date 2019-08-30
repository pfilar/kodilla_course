package com.kodilla.kodillapatterns2.observer;

import com.kodilla.kodillapatterns2.observer.forum.ForumTopic;
import com.kodilla.kodillapatterns2.observer.forum.ForumUser;
import com.kodilla.kodillapatterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.kodillapatterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuit {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Java help forum post 1");
        javaHelpForum.addPost("Java help forum post 2");
        javaHelpForum.addPost("Java help forum post 3");
        javaToolsForum.addPost("Java tools forum post 1");
        javaToolsForum.addPost("Java tools forum post 2");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
