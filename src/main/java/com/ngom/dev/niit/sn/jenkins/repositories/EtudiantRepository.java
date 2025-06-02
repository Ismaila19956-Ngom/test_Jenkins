package com.ngom.dev.niit.sn.jenkins.repositories;

import com.ngom.dev.niit.sn.jenkins.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Long> {
}
