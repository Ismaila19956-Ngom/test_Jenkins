package com.ngom.dev.niit.sn.jenkins.entities;

import com.ngom.dev.niit.sn.jenkins.domains.Auditable;
import com.ngom.dev.niit.sn.jenkins.enums.Genre;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "etudiants")
public class EtudiantEntity extends Auditable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Le prénom ne doit pas être vide")
    @Column(name = "prenom", nullable = false)
    private String prenom;

    @NotBlank(message = "Le nom ne doit pas être vide")
    @Column(name = "nom", nullable = false)
    private String nom;

    @NotBlank
    @Email(message = "L'email doit être valide")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Le numéro de téléphone ne doit pas être vide")
    @Column(name = "telephone", nullable = false)
    private String telephone;

    @NotBlank(message = "L'adresse ne doit pas être vide")
    @Column(name = "adresse", nullable = false)
    private String adresse;

    @NotNull(message = "La date de naissance ne doit pas être vide")
    @Column(name = "date_naissance", nullable = false)
    private LocalDate dateNaissance;

    @NotBlank(message = "Le lieu de naissance ne doit pas être vide")
    @Column(name = "lieu_naissance", nullable = false)
    private String lieuNaissance;

    @NotBlank(message = "La nationalité ne doit pas être vide")
    @Column(name = "nationalite", nullable = false)
    private String nationalite;

    @Enumerated(EnumType.STRING)
    private Genre genre;
}
