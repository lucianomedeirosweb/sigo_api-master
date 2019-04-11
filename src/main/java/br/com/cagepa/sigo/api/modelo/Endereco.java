package br.com.cagepa.sigo.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="endereco")
public class Endereco {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)  
	private Long id;
	
	@OneToOne
	@JoinColumn(name="idocorrencia")
	Ocorrencia ocorrencia;
	
	@Column(name="logradouro")
	private String logradouro;
	
	@Column(name="bairro")
	private String bairro;

	@Column(name="cidade")
	private String cidade;
	
}
