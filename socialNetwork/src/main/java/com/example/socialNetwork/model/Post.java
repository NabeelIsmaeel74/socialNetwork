package com.example.socialNetwork.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    @OneToOne
    @JoinColumn(name = "Post_id")
    @MapsId
    private Content PostID ;

    private  String content ;
    private Date date ;



}
