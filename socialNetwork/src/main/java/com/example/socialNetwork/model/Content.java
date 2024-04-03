package com.example.socialNetwork.model;

import com.example.socialNetwork.repo.UserRepo;
import com.example.socialNetwork.services.UserService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Table
@Entity
public class Content {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Content_id")
    private Long contentID ;

    private  int reactionCnt ;


    @ManyToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Users user ;


    public Content () {}

    public Content(Users user) {
        this.user = user ;
    }


    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public int getReactionCnt() {
        return reactionCnt;
    }

    public void setReactionCnt(int reactionCnt) {
        this.reactionCnt = reactionCnt;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentID=" + contentID +
                ", reactionCnt=" + reactionCnt +
                ", user=" + user +
                '}';
    }


}
