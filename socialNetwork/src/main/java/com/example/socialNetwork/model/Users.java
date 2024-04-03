package com.example.socialNetwork.model;


import com.example.socialNetwork.repo.ContentRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity
public class Users {


    @Id
    private  Long userId ;

    private String username ;

   public Users () {}

    public Users(Long userId, String username) {
        this.userId = userId;
        this.username = username;
    }
    public Users( String username) {
        this.username = username;
    }




    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }
}
