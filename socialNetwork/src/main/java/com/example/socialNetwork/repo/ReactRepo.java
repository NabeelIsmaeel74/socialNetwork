package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Reaction;
import com.example.socialNetwork.model.ReactionID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReactRepo extends JpaRepository<Reaction  , ReactionID> {
    @Query ("SELECT r FROM Reaction r WHERE r.contentID.contentID = :contentId")
    List<Reaction>  findAllReactionsByContentId(@Param("contentId") Long contentId);
}
