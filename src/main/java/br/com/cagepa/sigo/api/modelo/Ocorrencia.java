package br.com.cagepa.sigo.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ocorrencia")


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
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
	@Column(name="coordenada")
	private Double coordenada;
	
	
	
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

	public Ocorrencia() { 
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(String atuacao) {
		this.atuacao = atuacao;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Double coordenada) {
		this.coordenada = coordenada;
	}


	

	
	
	
}
