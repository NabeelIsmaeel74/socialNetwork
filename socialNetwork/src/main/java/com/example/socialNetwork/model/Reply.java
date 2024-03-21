package com.example.socialNetwork.model;


import jakarta.persistence.*;

import java.util.Date;

@Table
@Entity

public class Reply {

    @Id
    @OneToOne
    @JoinColumn(name = "reply_id")
    private Content replyID ;

    private String content ;
    private Date date ;

    @ManyToOne
    @JoinColumn(name = "reply_parent_id")
    private Content replyParentID ;

}
