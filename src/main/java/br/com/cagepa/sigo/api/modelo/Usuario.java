package br.com.cagepa.sigo.api.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="usuario")
@Data
public class Usuario {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)  
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	

	
	public Usuario(Long id, String nome, String email) {
		super();
		this.id = id;
	this.nome = nome;
	this.email = email;
	}

	
}
