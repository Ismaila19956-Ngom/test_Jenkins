package com.ngom.dev.niit.sn.jenkins.services.impl;

import com.ngom.dev.niit.sn.jenkins.dto.EtudiantDto;
import com.ngom.dev.niit.sn.jenkins.entities.EtudiantEntity;
import com.ngom.dev.niit.sn.jenkins.exception.ApiException;
import com.ngom.dev.niit.sn.jenkins.mapper.EtudiantMapper;
import com.ngom.dev.niit.sn.jenkins.repositories.EtudiantRepository;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import com.ngom.dev.niit.sn.jenkins.services.EtudiantService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantMapper etudiantMapper;
    private final EtudiantRepository etudiantRepository;

    @Override
    public EtudiantDto save(EtudiantRequest request) {
        log.info("Saving new Etudiant: {}", request);
        try {
            var entity = etudiantMapper.toEntity(request);
            var entitySaved = etudiantRepository.saveAndFlush(entity);
            EtudiantDto etudiantDto = etudiantMapper.toDto(entitySaved);
            log.info("Saved Etudiant: {}", etudiantDto);
            return etudiantDto;
        } catch (ApiException e) {
            log.error("Error saving Etudiant: {}", e.getMessage());
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public EtudiantDto update(Long id, EtudiantRequest request) {
        log.info("Updating Etudiant with id: {}, request: {}", id, request);
        EtudiantEntity etudiantEntity = etudiantRepository.findById(id).orElseThrow(() -> new ApiException(String.format("Etudiant not found with id: %s", id)));
        var entity = etudiantMapper.toUpdatedEntity(request, etudiantEntity);
        var entityUpdated = etudiantRepository.save(entity);
        return etudiantMapper.toDto(entityUpdated);
    }

    @Override
    public EtudiantDto findById(Long educationId) {
        log.info("Finding Etudiant by id: {}", educationId);
        return this.etudiantRepository.findById(educationId).map(etudiantMapper::toDto).orElseThrow(() -> new ApiException(String.format("Etudiant not found with id: %s", educationId)));
    }

    @Override
    public List<EtudiantDto> findAll() {
        log.info("Finding all Etudiants");
        return this.etudiantRepository.findAll().stream().map(etudiantMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long educationId) {
        log.info("Deleting Etudiant with id: {}", educationId);
        EtudiantEntity etudiantEntity = etudiantRepository.findById(educationId).orElseThrow(() -> new ApiException(String.format("Etudiant not found with id: %s", educationId)));
        this.etudiantRepository.delete(etudiantEntity);
    }
}
