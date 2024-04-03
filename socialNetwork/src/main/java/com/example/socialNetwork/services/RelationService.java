package com.example.socialNetwork.services;

import com.example.socialNetwork.Input.RequestInput;
import com.example.socialNetwork.model.FriendRequest;
import com.example.socialNetwork.model.Relationships;
import com.example.socialNetwork.model.Users;
import com.example.socialNetwork.repo.RelationRepo;
import com.example.socialNetwork.repo.RequestRepo;
import com.example.socialNetwork.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {

    @Autowired
    private RequestRepo requestRepo ;
    @Autowired
    private RelationRepo  relationRepo;
    @Autowired
    private UserRepo userRepo ;

    public FriendRequest addFriend(RequestInput requestInput)  {
        Users sender = userRepo.findById(requestInput.getSender()).orElseThrow(
                () -> new IllegalStateException("user not exist")
        ) ;

        Users receiver = userRepo.findById(requestInput.getReceiver()).orElseThrow(
                () -> new IllegalStateException("user not exist")
        ) ;

        FriendRequest friendRequest = new FriendRequest(sender , receiver) ;
        requestRepo.save(friendRequest) ;
        return friendRequest ;
    }

    public Relationships  acceptRequest(RequestInput requestInput) {
        Users sender = userRepo.findById(requestInput.getSender()).orElseThrow(
                () -> new IllegalStateException("user not exist")
        ) ;

        Users receiver = userRepo.findById(requestInput.getReceiver()).orElseThrow(
                () -> new IllegalStateException("user not exist")
        ) ;

        FriendRequest friendRequest = requestRepo.findRequest(sender , receiver) ;
        requestRepo.delete(friendRequest);

        Relationships rel = new Relationships(sender , receiver) ;
        return relationRepo.save(rel) ;
    }


}
