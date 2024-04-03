package com.example.socialNetwork.model;

import jakarta.persistence.*;

@Table
@Entity

public class FriendRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "Request_id")
    private Long ID ;

    @ManyToOne
    @JoinColumn
    private Users sender ;

    @ManyToOne
    @JoinColumn
    private Users receiver ;

    public FriendRequest() {}
    public FriendRequest(Users sender, Users receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Users getSender() {
        return sender;
    }

    public void setSender(Users sender) {
        this.sender = sender;
    }

    public Users getReceiver() {
        return receiver;
    }

    public void setReceiver(Users receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "FriendRequest{" +
                "ID=" + ID +
                ", sender=" + sender +
                ", receiver=" + receiver +
                '}';
    }
}
