package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment  , Long> {
    @Query("SELECT c.ID FROM Comment c WHERE c.postId.ID = :postId")
    List<Long> findCommentIdsByPostId(@Param("postId") Long postId);

}
