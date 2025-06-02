package com.ngom.dev.niit.sn.jenkins.controller.api;

import com.ngom.dev.niit.sn.jenkins.domains.record.HttpResponse;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/api/etudiants")
public interface EtudiantApi {

    @PostMapping
    ResponseEntity<HttpResponse> save(@RequestBody @Valid EtudiantRequest request);

    @PutMapping(path = "/{educationId}")
    ResponseEntity<HttpResponse> update(@PathVariable("educationId") Long educationId, @RequestBody @Valid EtudiantRequest request);

    @GetMapping(path = "/{educationId}")
    ResponseEntity<HttpResponse> findById(@PathVariable("educationId") Long educationId);

    @GetMapping
    ResponseEntity<HttpResponse> findAll();

    @DeleteMapping(path = "/{educationId}")
    ResponseEntity<HttpResponse> deleteById(@PathVariable("educationId") Long educationId);
}
