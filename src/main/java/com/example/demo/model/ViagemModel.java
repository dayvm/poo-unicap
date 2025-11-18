package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_viagens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ViagemModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne //pode ter muitos objetos ViagemModel que pertencam a um objeto MotoristaModel
	@JoinColumn(name="motorista_id", nullable=false)
	private MotoristaModel motorista;
	
	@ManyToOne
	@JoinColumn(name="usuario_id", nullable=false)
	private UserModel usuario;
}
