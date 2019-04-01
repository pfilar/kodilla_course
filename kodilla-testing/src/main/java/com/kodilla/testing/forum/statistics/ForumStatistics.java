package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    // private Statistic statistic;   //  pominąć
    private int usersCount;                 // liczba użytkowników
    private int postsCount;                 // liczba postów
    private int commentsCount;              // liczna komentarzy
    private double avgPostsPerUsers;        // avg postów na ilość użytkownikow
    private double avgCommentsPerUsers;     // avg komentarzy na ilość użytkowników
    private double avgCommentsPerPosts;     // avg komentarzy na ilość postów

   // public List<Statistics> usersNames = new ArrayList<>();   // niepotrzebne

    //    public ForumStatistics(Statistic statistic) {         // niepotrzebne
    //        this.statistic = statistic;
    //    }

    public void calculateAdvStatistics(Statistics statistics){      //   do argumentu metody
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        avgPostsPerUsers = (double) postsCount / (double) usersCount;
        if (usersCount ==0) {
            avgPostsPerUsers = 0;
        }
        avgCommentsPerUsers = (double) commentsCount / (double) usersCount;
        if (usersCount == 0){
            avgCommentsPerUsers = 0;
        }
        avgCommentsPerPosts = (double) commentsCount / (double) postsCount;
        if (postsCount == 0) {
            avgCommentsPerPosts = 0;
        }

        //if (postsCount == 0) {    // można tak
        //    avgCommentsPerPosts = 0;
        //}else{
        //   avgCommentsPerPosts = (double) commentsCount / (double) postsCount;
        //}
    }

    public void showStatistics() {
        // System.out.println(calculateAdvStatistics(Statistics statistics)); // metoda void nie da rady wyswietlić

        System.out.println("numbers of users: " +getUsersCount());
        System.out.println(getPostsCount());
        System.out.println(getCommentsCount());
        System.out.println(getAvgPostsPerUsers());
        System.out.println(getAvgCommentsPerUsers());
        System.out.println(getAvgCommentsPerPosts());
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUsers() {
        return avgPostsPerUsers;
    }

    public double getAvgCommentsPerUsers() {
        return avgCommentsPerUsers;
    }

    public double getAvgCommentsPerPosts() {
        return avgCommentsPerPosts;
    }
}
