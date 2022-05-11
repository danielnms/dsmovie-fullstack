package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Configura a Classe como uma Entidade
@Table(name = "tb_movie") // Configura o nome da Tabela
public class Movie {
	
	// Atributos Privados
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Gerador de valores auto incrementados
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	// Contrutor
	public Movie(){	
	}
	
	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}
	
	// Métodos Getters (Acessores)
	public Long getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public Double getScore() {
		return this.score;
	}
	
	public Integer getCount() {
		return this.count;
	}
	
	public String getImage() {
		return this.image;
	}
	
	// Métodos Setters (Nodificadores)
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setScore(Double score) {
		this.score = score;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
}
