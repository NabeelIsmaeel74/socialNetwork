package com.example.socialNetwork.model;

import jakarta.persistence.*;

@Entity
@Table
public class Relationships {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relationshipsId ;

    private Integer relationType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "user1_id")
    private Users user1 ;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user2_id")
    private Users user2 ;

    public Relationships() {}

    public Relationships(Users user1 , Users user2) {
        this.user1 = user1 ;
        this.user2 = user2 ;
        this.relationType = 1 ;
    }


    public Long getRelationshipsId() {
        return relationshipsId;
    }

    public Integer getRelationType() {
        return relationType;
    }

    public Users getUser1() {
        return user1;
    }

    public Users getUser2() {
        return user2;
    }

    public void setrelationshipsId(Long relationshipsId) {
        this.relationshipsId = relationshipsId;
    }

    public void setrelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public void setUser1(Users user1) {
        this.user1 = user1;
    }

    public void setUser2(Users user2) {
        this.user2 = user2;
    }
}
