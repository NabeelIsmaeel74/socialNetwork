package com.example.socialNetwork.model;


import jakarta.persistence.*;

import java.util.Date;

@Table
@Entity

public class Reply {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @OneToOne
    @JoinColumn(name = "reply_id")
    @MapsId
    private Content replyID ;

    private String content ;
    private Date date ;

    @ManyToOne
    @JoinColumn(name = "reply_parent_id")
    private Content replyParentID ;

}
