package com.example.socialNetwork.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Table
@Entity

public class Reply {

    @Id
    @Column(name = "reply_id")
    private Long ID ;
    @MapsId
    @OneToOne
    @JoinColumn(name = "reply_id")
    private Content replyId ;

    private String replyContent ;
    private LocalDate date ;

    @ManyToOne
    @JoinColumn(name = "reply_parent_id")
    private Content replyParentId ;

    public Reply() { }

    public Reply(Content replyId, String replyContent, Content replyParentId) {
        this.replyId = replyId;
        this.replyContent = replyContent;
        this.replyParentId = replyParentId;
        this.date = LocalDate.now() ;
    }

    public Content getReplyID() {
        return replyId;
    }

    public String getContent() {
        return replyContent;
    }

    public LocalDate getDate() {
        return date;
    }

    public Content getReplyParentID() {
        return replyParentId;
    }

    public void setReplyID(Content replyID) {
        this.replyId = replyID;
    }

    public void setContent(String content) {
        this.replyContent = content;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setReplyParentID(Content replyParentID) {
        this.replyParentId = replyParentID;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", replyContent='" + replyContent + '\'' +
                ", date=" + date +
                ", replyParentId=" + replyParentId +
                '}';
    }
}
