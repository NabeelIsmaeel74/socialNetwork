package com.example.socialNetwork.services;


import com.example.socialNetwork.Input.CommentInput;
import com.example.socialNetwork.Input.PostInput;
import com.example.socialNetwork.Input.ReactInput;
import com.example.socialNetwork.Input.ReplyInput;
import com.example.socialNetwork.model.*;
import com.example.socialNetwork.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    @Autowired
    private ContentRepo contentRepo ;
    @Autowired
    private PostRepo postRepo ;
    @Autowired
    private CommentRepo commentRepo ;
    @Autowired
    private UserRepo userRepo ;
    @Autowired
    private ReplyRepo replyRepo ;
    @Autowired
    private ReactRepo reactRepo ;

    public Post createPost(PostInput postInput) {
        Users user = userRepo.findById(postInput.getUserID()).orElseThrow(
                () -> new IllegalStateException("user not exist")

        ) ;

        Content content = new Content(user) ;
        contentRepo.save(content) ;

        Post post = new Post(content , postInput.getPostContent()) ;
        postRepo.save(post) ;
        return post ;
    }


    public Comment addComment(CommentInput commentInput) {
        Users user = userRepo.findById(commentInput.getUserId()).orElseThrow(
                () -> new IllegalStateException("user not exist")

        ) ;

        Post post = postRepo.findById(commentInput.getContentId()).orElseThrow(
                () -> new IllegalStateException("There is no Post with ID = " + commentInput.getContentId())
        ) ;

        Content content = new Content(user) ;
        contentRepo.save(content) ;

        Comment comment= new Comment(content , commentInput.getCommentContent() , post) ;
        commentRepo.save(comment) ;

        return comment ;
    }


    public  Reply addReply(ReplyInput replyInput) {
        Users user = userRepo.findById(replyInput.getUserId()).orElseThrow(
                () -> new IllegalStateException("user not exist")

        ) ;

        Comment comment = commentRepo.findById(replyInput.getCommentId()).orElseThrow(
                () -> new IllegalStateException("The comment not exist")
        ) ;

        Content content = new Content(user) ;
        contentRepo.save(content) ;

        Reply reply = new Reply(content  , replyInput.getReplyContent() , comment.getContentId())  ;
        replyRepo.save(reply) ;
        return reply ;

    }


    public Reaction addReact(ReactInput reactInput) {
        Users user = userRepo.findById(reactInput.getUserId()).orElseThrow(
                () -> new IllegalStateException("user not exist")
        ) ;

        Content content = contentRepo.findById(reactInput.getContentId()).orElseThrow(
                () -> new IllegalStateException("The content not exist ")
        );

        content.setReactionCnt(content.getReactionCnt() +1);
        Reaction reaction = new Reaction(content , user , reactInput.getType() ) ;
        reactRepo.save(reaction) ;
        return reaction ;

    }




}
