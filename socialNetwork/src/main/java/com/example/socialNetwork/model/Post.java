package com.example.socialNetwork.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class Post {


    @Id
    @OneToOne
    @JoinColumn(name = "Post_id")
    private Content PostID ;

    private  String content ;
    private Date date ;



}
