package br.com.alura.challenges.favorite.music.models;

import br.com.alura.challenges.favorite.music.services.IAudioService;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Audio implements Serializable, IAudioService {

	@Serial private static final long serialVersionUID = 3787892257030700597L;

	private UUID id;
	private String titulo;
	private Integer totalReproducoes;
	private Integer totalCurtidas;
	private Integer classificacao;

	public Audio(String titulo, Integer totalReproducoes, Integer totalCurtidas, Integer classificacao) {
		this.id = UUID.randomUUID();
		this.titulo = titulo;
		this.totalReproducoes = totalReproducoes;
		this.totalCurtidas = totalCurtidas;
		this.classificacao = classificacao;
	}

	public UUID getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getTotalReproducoes() {
		return totalReproducoes;
	}

	public Integer getTotalCurtidas() {
		return totalCurtidas;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	protected void setClassificacao(Integer value) {
		classificacao = value;
	}

	@Override
	public void curte() {
		this.totalCurtidas++;
	}

	@Override
	public void reproduz() {
		this.totalReproducoes++;
	}

}
