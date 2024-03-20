package com.example.socialNetwork.model;

import jakarta.persistence.*;

@Entity
@Table
public class Relationships {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RelationshipsID ;

    private int RelationType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "user1_id")
    private Users user1 ;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user2_id")
    private Users user2 ;


}
