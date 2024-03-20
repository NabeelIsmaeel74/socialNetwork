package com.example.socialNetwork.model;


import jakarta.persistence.*;

@Table
@Entity

public class Reaction {

    @Id
    private  Long id ;

    private  int type ;

    @ManyToOne
    @JoinColumn(name = "content_id")
    @MapsId
    private Content contentID ;


    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private Users userID ;





}
