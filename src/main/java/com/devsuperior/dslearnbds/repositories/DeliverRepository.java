package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Deliver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliverRepository  extends JpaRepository<Deliver, Long> {
}
