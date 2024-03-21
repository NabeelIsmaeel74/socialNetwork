package com.example.socialNetwork.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity
public class Users {

    @Id
    private  Long userId ;

    private String hashPass ;


    @OneToMany(mappedBy = "user1" , fetch = FetchType.LAZY)
    private List<Relationships> relationships = new ArrayList<>() ;


    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY , mappedBy = "user")
    private List<Content> contentList = new ArrayList<>() ;

    @OneToMany(mappedBy = "userID")
    List<Reaction> Reactions  = new ArrayList<>() ;
}
