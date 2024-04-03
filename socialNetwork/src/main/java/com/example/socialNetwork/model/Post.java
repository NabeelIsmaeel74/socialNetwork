package com.example.socialNetwork.model;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
@Table
public class Post {

    @Id
    @Column(name = "Post_id")
    private Long ID ;

    @OneToOne
    @MapsId
    @JoinColumn (name = "Post_id" )
    private Content content ;




    private  String postContent ;
    private LocalDate date ;

    public Post() {}
    public Post(Content content , String postContent) {
        this.content = content ;
        this.postContent = postContent ;
        this.date = LocalDate.now() ;
    }




    public Content getContent() {
        return content;
    }

    public String getPostContent() {
        return postContent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Post{" +
                "ID=" + ID +
                ", content=" + content +
                ", postContent='" + postContent + '\'' +
                ", date=" + date +
                '}';
    }
}
