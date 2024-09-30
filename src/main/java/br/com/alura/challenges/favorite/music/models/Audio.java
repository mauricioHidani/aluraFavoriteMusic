package br.com.alura.challenges.favorite.music.models;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Audio implements Serializable {

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

	public static AudioBuilder builder() {
		return new AudioBuilder();
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

	public void curte() {
		this.totalCurtidas++;
	}

	public void reproduz() {
		this.totalReproducoes++;
	}

	public static class AudioBuilder {
		private String titulo;
		private Integer totalReproducoes;
		private Integer totalCurtidas;
		private Integer classificacao;

		public AudioBuilder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}

		public AudioBuilder totalReproducoes(Integer totalReproducoes) {
			this.totalReproducoes = totalReproducoes;
			return this;
		}

		public AudioBuilder totalCurtidas(Integer totalCurtidas) {
			this.totalCurtidas = totalCurtidas;
			return this;
		}

		public AudioBuilder classificacao(Integer classificacao) {
			this.classificacao = classificacao;
			return this;
		}


		public Audio build() {
			return new Audio(titulo, totalReproducoes, totalCurtidas, classificacao);
		}
	}

}
