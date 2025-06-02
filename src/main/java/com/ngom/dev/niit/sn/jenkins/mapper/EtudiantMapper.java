package com.ngom.dev.niit.sn.jenkins.mapper;

import com.ngom.dev.niit.sn.jenkins.dto.EtudiantDto;
import com.ngom.dev.niit.sn.jenkins.entities.EtudiantEntity;
import com.ngom.dev.niit.sn.jenkins.requests.EtudiantRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EtudiantMapper {
    EtudiantDto toDto(EtudiantEntity etudiantEntity);
    EtudiantEntity toEntity(EtudiantRequest etudiantRequest);
    EtudiantEntity toUpdatedEntity(EtudiantRequest etudiantRequest, @MappingTarget EtudiantEntity etudiantEntity);
}
