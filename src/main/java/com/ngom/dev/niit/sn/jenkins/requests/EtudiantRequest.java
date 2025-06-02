package com.ngom.dev.niit.sn.jenkins.requests;

import com.ngom.dev.niit.sn.jenkins.enums.Genre;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantRequest {

    private Long id;

    @NotBlank(message = "Le prénom ne doit pas être vide")
    private String prenom;

    @NotBlank(message = "Le nom ne doit pas être vide")
    private String nom;

    @NotBlank
    @Email(message = "L'email doit être valide")
    private String email;

    @NotBlank(message = "Le numéro de téléphone ne doit pas être vide")
    private String telephone;

    @NotBlank(message = "L'adresse ne doit pas être vide")
    private String adresse;

    @NotNull(message = "La date de naissance ne doit pas être vide")
    private LocalDate dateNaissance;

    @NotBlank(message = "Le lieu de naissance ne doit pas être vide")
    private String lieuNaissance;

    @NotBlank(message = "La nationalité ne doit pas être vide")
    private String nationalite;

    private Genre genre;
}
