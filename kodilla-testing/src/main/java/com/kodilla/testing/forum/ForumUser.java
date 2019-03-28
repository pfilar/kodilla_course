package com.kodilla.testing.forum;
import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {

    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();   //  tworzone od razu przez (operator new), nie potrzebny konstruktora
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();  //  tworzone od razu przez (operator new), nie potrzebny konstruktora

    public ForumUser(String name, String realName) {
            //name visible on forum
        this.name = name;
            //real name of the user
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {       // dodana
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {  // dodana
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public int getPostsQuantity() {  // dodana
        return posts.size();
    }

    public int getCommentsQuantity() {  // dodana
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {   // dodana
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {  // dodana
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
