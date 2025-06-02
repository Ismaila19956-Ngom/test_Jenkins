package com.ngom.dev.niit.sn.jenkins.dto;

import com.ngom.dev.niit.sn.jenkins.domains.Auditable;
import com.ngom.dev.niit.sn.jenkins.enums.Genre;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDto extends Auditable {
    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String telephone;
    private String adresse;
    private LocalDate dateNaissance;
    private String lieuNaissance;
    private String nationalite;
    private Genre genre;
}
