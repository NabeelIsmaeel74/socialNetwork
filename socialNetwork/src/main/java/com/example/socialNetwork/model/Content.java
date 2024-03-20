package com.example.socialNetwork.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Content_id")
    private Long contentID ;

    private  int reactionCnt ;

    @ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users user ;

    @OneToMany(mappedBy = "replyParentID")
    List<Reply> replies  = new ArrayList<>() ;

    @OneToMany(mappedBy = "contentID")
    List<Reaction> Reactions  = new ArrayList<>() ;



}
