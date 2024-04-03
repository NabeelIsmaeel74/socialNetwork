package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReplyRepo extends JpaRepository<Reply , Long> {

    @Query("SELECT r.replyId.ID FROM Reply r WHERE r.replyParentId.ID = :commentId")
    List<Long> findReplyIdsByCommentId(@Param("commentId") Long commentId);

}
