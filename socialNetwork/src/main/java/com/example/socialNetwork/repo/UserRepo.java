package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users , Long> {
}
