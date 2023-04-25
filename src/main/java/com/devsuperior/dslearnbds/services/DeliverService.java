package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    // Id do Deliver ( de qual entrega o professor esta corrigindo)
    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        Deliver deliver = deliverRepository.getOne(id);
        deliver.setFeedback(dto.getFeedback());
        deliver.setStatus(dto.getStatus());
        deliver.setCorrectCount(dto.getCorrectCount());
        deliverRepository.save(deliver);
    }
}