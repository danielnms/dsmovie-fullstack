package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Configura a Classe como uma Entidade
@Table(name = "tb_user") // Configura o nome da Tabela
public class User {
	
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Gerador de valores auto incrementados
	private Long id;
	private String email;
	
	// Contrutor
	public User() {
	}

	public User(Long id, String email) {		super();
		this.id = id;
		this.email = email;
	}
	
	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
