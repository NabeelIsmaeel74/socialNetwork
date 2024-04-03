package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Content;
import com.example.socialNetwork.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post , Long> {
}
