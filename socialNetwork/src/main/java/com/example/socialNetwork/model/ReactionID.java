package com.example.socialNetwork.model;


import java.io.Serializable;


public class ReactionID implements Serializable {

    private Content contentID ;
    private Users userID ;

    public Content getContentID() {
        return contentID;
    }

    public Users getUserID() {
        return userID;
    }

    public void setContentID(Content contentID) {
        this.contentID = contentID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }
}
