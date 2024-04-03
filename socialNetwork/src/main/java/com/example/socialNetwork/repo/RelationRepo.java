package com.example.socialNetwork.repo;

import com.example.socialNetwork.model.Reaction;
import com.example.socialNetwork.model.Relationships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationRepo extends JpaRepository<Relationships, Long> {
}
