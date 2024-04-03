package com.example.socialNetwork.model;


import jakarta.persistence.*;

@Table
@Entity
@IdClass(ReactionID.class)
public class Reaction {


    @Id
    @ManyToOne
    @JoinColumn(name = "content_id")
    private Content contentID ;


    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userID ;


    private  Integer type ;

    public  Reaction() {}

    public Reaction(Content contentID, Users userID, Integer type) {
        this.contentID = contentID;
        this.userID = userID;
        this.type = type;
    }

    public Content getContentID() {
        return contentID;
    }

    public Users getUserID() {
        return userID;
    }

    public Integer getType() {
        return type;
    }

    public void setContentID(Content contentID) {
        this.contentID = contentID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "contentID=" + contentID +
                ", userID=" + userID +
                ", type=" + type +
                '}';
    }
}
