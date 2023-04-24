package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplayRepository extends JpaRepository<Reply, Long> {
}
