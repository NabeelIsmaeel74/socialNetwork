package com.example.socialNetwork.model;


import jakarta.persistence.*;

@Table
@Entity

public class Reaction {


    private  int type ;


    @Id
    @ManyToOne
    @JoinColumn(name = "content_id")
    private Content contentID ;


    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userID ;

}
