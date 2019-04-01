package com.kodilla.testing.forum.statistics;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statistics;
    private ForumStatistics forumStatistics;

    @Before
    public void before() {
        statistics = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWithMockPosts0() {           // ilość postów 0
        // Given
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(50);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        names.add("Jan Nowak");
        names.add("Jan Kowalski");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersCount());
        Assert.assertEquals(0, forumStatistics.getPostsCount());
        Assert.assertEquals(50, forumStatistics.getCommentsCount());
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(25, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockPosts1000() {  // ilość postów 1000
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        names.add("Jan Nowak");
        names.add("Jan Kowalski");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(5000, forumStatistics.getCommentsCount());
        Assert.assertEquals(500, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(2500, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(5, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockComments0() {     // 0 komentarzy
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        names.add("Jan Nowak");
        names.add("Jan Kowalski");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(0, forumStatistics.getCommentsCount());
        Assert.assertEquals(500, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockLessCommentsThenPosts() {     // ilość kom < ilość postów
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        names.add("Jan Nowak");
        names.add("Jan Kowalski");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(500, forumStatistics.getCommentsCount());
        Assert.assertEquals(500, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(250, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(0.5, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockMoreCommentsThenPosts() {     // ilość kom > ilość postów
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        names.add("Jan Nowak");
        names.add("Jan Kowalski");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(5000, forumStatistics.getCommentsCount());
        Assert.assertEquals(500, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(2500, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(5, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockUsers0() {      // ilosć użytkowników = 0
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(5000, forumStatistics.getCommentsCount());
        Assert.assertEquals(0, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(5, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsWithMockUsers100() {  // ilosć użytkowników = 100
        // Given
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5000);
        List<String> names = new ArrayList<>();             // stwoarzenie ArrayList do usersName
        for(int i = 1; i <= 100; i++)
            names.add("name");
        when(statistics.usersNames()).thenReturn(names);

        // When
        forumStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, forumStatistics.getUsersCount());
        Assert.assertEquals(1000, forumStatistics.getPostsCount());
        Assert.assertEquals(5000, forumStatistics.getCommentsCount());
        Assert.assertEquals(10, forumStatistics.getAvgPostsPerUsers(), 0.001);  // trzeci parametr delta mak. dopuszczalna różnica między wartością oczekiwaną a rzeczy
        Assert.assertEquals(50, forumStatistics.getAvgCommentsPerUsers(), 0.001);
        Assert.assertEquals(5, forumStatistics.getAvgCommentsPerPosts(), 0.001);
    }

















    // public double avg () {
    //
    //   double sum = 0;
    //    for(int i = 0; i < list.length; i++) {
    //
    //        sum += list[i];
    //    }
    //
    //    double avg = sum / list.length;
    //    return avg;
    // }

    //100 komentarzy
    //list = new ArrayList<>();
    //    for(int i = 1; i <= 100; i++){
    //    list.add(i);
    //}


}
