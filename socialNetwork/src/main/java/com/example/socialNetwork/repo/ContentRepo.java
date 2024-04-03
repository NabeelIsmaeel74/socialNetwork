package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepo extends JpaRepository<Content , Long> {
    @Query("SELECT c FROM Content c WHERE c.user.userId = :userId")
    List<Content> findContentsByUserId(@Param("userId") Long userId);


}
