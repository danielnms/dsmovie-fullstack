package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // Configura a Classe como uma Entidade
@Table(name = "tb_score") // Configura o nome da Tabela
public class Score {
	
	@EmbeddedId 
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score() {
	}
	
	// Métodos de associação com chave primária
	public void setMovie(Movie movie) {
		this.setMovie(movie);
	}
	
	public void setUser(User user) {
		this.setUser(user);
	}

	// Getters e Setters
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
