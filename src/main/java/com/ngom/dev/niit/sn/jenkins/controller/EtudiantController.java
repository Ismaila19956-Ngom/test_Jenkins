package com.ngom.dev.niit.sn.jenkins.controller;

import com.ngom.dev.niit.sn.jenkins.controller.api.EtudiantApi;
import com.ngom.dev.niit.sn.jenkins.domains.record.HttpResponse;
import com.ngom.dev.niit.sn.jenkins.dto.EtudiantDto;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import com.ngom.dev.niit.sn.jenkins.services.EtudiantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequiredArgsConstructor
public class EtudiantController implements EtudiantApi {

    private final EtudiantService etudiantService;

    @Override
    public ResponseEntity<HttpResponse> save(@RequestBody @Valid EtudiantRequest request) {
        EtudiantDto createdEtudiant = etudiantService.save(request);
        return ResponseEntity.created(URI.create(String.format("/etudiants/%s", createdEtudiant.getId())))
                .body(HttpResponse.builder()
                    .message("Etudiant created successfully")
                    .data(Map.of("etudiant", createdEtudiant))
                    .code(201)
                    .status(CREATED)
                    .build());
    }

    @Override
    public ResponseEntity<HttpResponse> update(Long educationId, EtudiantRequest request) {
        EtudiantDto updatedEtudiant = etudiantService.update(educationId, request);
        return ResponseEntity.ok(HttpResponse.builder()
                        .message("Etudiant created successfully")
                        .data(Map.of("etudiant", updatedEtudiant))
                        .code(201)
                        .status(NO_CONTENT)
                        .build());
    }

    @Override
    public ResponseEntity<HttpResponse> findById(Long educationId) {
        EtudiantDto etudiant = etudiantService.findById(educationId);
        return ResponseEntity.ok(HttpResponse.builder()
                .message("Etudiant found successfully")
                .data(Map.of("etudiant", etudiant))
                .code(201)
                .status(OK)
                .build());
    }

    @Override
    public ResponseEntity<HttpResponse> findAll() {
        var etudiants = etudiantService.findAll();
        return ResponseEntity.ok(HttpResponse.builder()
                .message("Etudiant found successfully")
                .data(Map.of("etudiants", etudiants))
                .code(201)
                .status(OK)
                .build());
    }

    @Override
    public ResponseEntity<HttpResponse> deleteById(Long educationId) {
        etudiantService.deleteById(educationId);
        return ResponseEntity.ok(HttpResponse.builder()
                .message("Etudiant deleted successfully")
                .data(Map.of("educationId", educationId))
                .code(201)
                .status(NO_CONTENT)
                .build());
    }
}
