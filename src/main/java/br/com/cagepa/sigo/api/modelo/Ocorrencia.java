package br.com.cagepa.sigo.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ocorrencia")
@Data
public class Ocorrencia {
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)  
	private Long id;
	
	@Column(name="descricao")
	private String descricao;
	
	
	
	public Ocorrencia(Long id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public char[] getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
	
	
}
