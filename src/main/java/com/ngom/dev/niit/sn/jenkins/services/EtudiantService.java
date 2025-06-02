package com.ngom.dev.niit.sn.jenkins.services;

import com.ngom.dev.niit.sn.jenkins.dto.EtudiantDto;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import com.ngom.dev.niit.sn.jenkins.services.interfaces.GenericOperation;

import java.util.List;

public interface EtudiantService extends GenericOperation<EtudiantDto, EtudiantRequest, Long> {
    EtudiantDto save(EtudiantRequest request);
    EtudiantDto update(Long id, EtudiantRequest request);
    EtudiantDto findById(Long educationId);
    List<EtudiantDto> findAll();
    void deleteById(Long educationId);
}
