package com.example.socialNetwork.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class Comment {


    @Id
    @OneToOne
    @JoinColumn(name = "Comment_id")
    private Content PostID ;

    private  String content ;
    private Date date ;
}
