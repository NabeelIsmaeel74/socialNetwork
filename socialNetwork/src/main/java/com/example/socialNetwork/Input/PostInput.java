package com.example.socialNetwork.Input;

public class PostInput {
    private  Long userID ;
    private  String postContent ;



    public Long getUserID() {
        return userID;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String str) {
        this.postContent = str;
    }

    @Override
    public String toString() {
        return "postInput{" +
                "userID=" + userID +
                ", PostContent='" + postContent + '\'' +
                '}';
    }
}
