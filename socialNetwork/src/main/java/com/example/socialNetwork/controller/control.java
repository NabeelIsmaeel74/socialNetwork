package com.example.socialNetwork.controller;

import com.example.socialNetwork.Input.*;
import com.example.socialNetwork.model.*;
import com.example.socialNetwork.services.ContentService;
import com.example.socialNetwork.services.RelationService;
import com.example.socialNetwork.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class control {

    @Autowired
    private UserService userService ;
    @Autowired
    private ContentService contentService ;

    @Autowired
    private RelationService relationService ;




    @PostMapping("/reg")
    Users addUser(@RequestBody Users user) {
        return  this.userService.saveUser(user);
    }

    @PostMapping("/share")
    Post sharePost(@RequestBody PostInput postInput) {
        return  contentService.createPost(postInput) ;
    }

    @PostMapping("/comment")
    Comment  commentPost(@RequestBody CommentInput commentInput) {
        return  contentService.addComment(commentInput) ;
    }


    @PostMapping("/reply")
    Reply replyComment(@RequestBody ReplyInput replyInput) {
        return  contentService.addReply(replyInput) ;
    }

    @PostMapping("/react")
    Reaction react(@RequestBody ReactInput reactInput) {
        return  contentService.addReact(reactInput) ;
    }

    @PostMapping("/request")
    FriendRequest addFriend(@RequestBody RequestInput requestInput) {
        return  relationService.addFriend(requestInput) ;
    }

    @PostMapping("/accept")
    Relationships accept(@RequestBody RequestInput requestInput) {
        return  relationService.acceptRequest(requestInput) ;
    }











}
