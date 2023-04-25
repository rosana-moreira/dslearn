package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {
    @Autowired
    private DeliverService service;
    // Pre-autorizar esse response para so aceitar INSTRUCTOR ou ADMIN
    /*
     * Exemplo : Se o perfil do usuairo logado nao for nem INSTRUCTOR nem ADMIN n vai nem processar
     */
    @PreAuthorize("hasAnyRole('INSTRUCTOR','ADMIN')")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> findById(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto) {
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }

}
