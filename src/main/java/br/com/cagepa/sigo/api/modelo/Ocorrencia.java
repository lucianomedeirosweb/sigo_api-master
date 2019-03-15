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
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="atuacao")
	private String atuacao;
	
	@Column(name="latitude")
	private double latitude;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="coordenada")
	private double coordenada;
	
	
	
	public Ocorrencia(Long id, String descricao, String tipo, String endereco, String atuacao, double latitude, double
			longitude, double coordenada) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.endereco = endereco;
		this.atuacao = atuacao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.coordenada = coordenada;
	}

	
	

	
	
	
}
