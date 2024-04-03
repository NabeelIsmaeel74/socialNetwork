package com.example.socialNetwork.services;

import com.example.socialNetwork.model.Users;
import com.example.socialNetwork.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo ;

    public Users getUser(Long userId) {
        Optional<Users> ret = this.userRepo.findById(userId) ;
        if (ret.isPresent())
            return  ret.get() ;
        return null ;
    }

    public Users saveUser(Users user) {
        if (getUser(user.getUserId()) ==null ) {
            this.userRepo.save(user ) ;
            System.out.println("Done!!!");
        } else {
            throw new  IllegalStateException("The user exist") ;
        }
        return user ;
    }



}
