package com.example.demo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Table;


@Entity
@Table(name="tb_motorista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MotoristaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy="motorista")
    private List<ViagemModel> viagens;

    @OneToMany(mappedBy="motoristasConectados")
    private List<UserModel> usuariosConectados;
}