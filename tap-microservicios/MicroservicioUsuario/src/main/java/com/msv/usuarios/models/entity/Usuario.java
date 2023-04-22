package com.msv.usuarios.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(nullable = false)
    @NotBlank
    private String nombre;

    @Column(unique = true)
    @NotBlank
    private String email;

    @Column(nullable = false)
    @NotBlank
    private String password;
}
