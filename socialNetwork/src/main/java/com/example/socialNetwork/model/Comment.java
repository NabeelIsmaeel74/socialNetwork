package com.example.socialNetwork.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table

public class Comment {

    @Id
    @Column(name = "Comment_id")
    private Long ID ;

    @MapsId
    @OneToOne
    @JoinColumn(name = "Comment_id")
    private Content contentId ;

    @ManyToOne
    @JoinColumn(name = "Post_id")
    private Post postId ;

    private  String commentContent ;
    private LocalDate date ;

    public Comment(Content contentId, String commentContent , Post postId) {
        this.postId = postId ;
        this.contentId = contentId;
        this.commentContent = commentContent;
        this.date = LocalDate.now() ;

    }

    public Comment() {}

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }


    public LocalDate getDate() {
        return date;
    }


    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "ID=" + ID +
                ", contentId=" + contentId +
                ", postId=" + postId +
                ", commentContent='" + commentContent + '\'' +
                ", date=" + date +
                '}';
    }
}
