package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.FriendRequest;
import com.example.socialNetwork.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RequestRepo extends JpaRepository<FriendRequest, Long> {

    @Query("SELECT f FROM FriendRequest f WHERE f.sender = :sender AND f.receiver = :receiver ")
    FriendRequest findRequest(@Param("sender") Users sender , @Param("receiver") Users receiver )  ;

}
