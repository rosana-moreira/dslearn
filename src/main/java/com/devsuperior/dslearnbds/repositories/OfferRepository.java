package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository  extends JpaRepository<Offer, Long> {
}
