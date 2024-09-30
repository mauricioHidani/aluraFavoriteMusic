package br.com.alura.challenges.favorite.music.models;

import java.io.Serial;
import java.io.Serializable;

public class Podcast extends Audio implements Serializable {

	@Serial private static final long serialVersionUID = 7293233342615574208L;

	private String apresentador;
	private String descricao;

	public Podcast(String titulo, Integer totalReproducoes, Integer totalCurtidas, Integer classificacao,
				   String apresentador, String descricao) {
		super(titulo, totalReproducoes, totalCurtidas, classificacao);
		this.apresentador = apresentador;
		this.descricao = descricao;
	}

	public Podcast(PodcastBuilder builder) {
		super(builder.titulo, builder.totalReproducoes, builder.totalCurtidas, builder.classificacao);
		this.apresentador = builder.apresentador;
		this.descricao = builder.descricao;
	}

	public static PodcastBuilder builder() {
		return new PodcastBuilder();
	}

	public String getApresentador() {
		return apresentador;
	}

	public String getDescricao() {
		return descricao;
	}

	public static class PodcastBuilder {
		private String titulo;
		private Integer totalReproducoes;
		private Integer totalCurtidas;
		private Integer classificacao;
		private String apresentador;
		private String descricao;

		public PodcastBuilder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}

		public PodcastBuilder totalReproducoes(Integer totalReproducoes) {
			this.totalReproducoes = totalReproducoes;
			return this;
		}

		public PodcastBuilder totalCurtidas(Integer totalCurtidas) {
			this.totalCurtidas = totalCurtidas;
			return this;
		}

		public PodcastBuilder classificacao(Integer classificacao) {
			this.classificacao = classificacao;
			return this;
		}

		public PodcastBuilder apresentador(String apresentador) {
			this.apresentador = apresentador;
			return this;
		}

		public PodcastBuilder descricao(String descricao) {
			this.descricao = descricao;
			return this;
		}

		public Podcast build() {
			return new Podcast(titulo, totalReproducoes, totalCurtidas, classificacao, apresentador, descricao);
		}
	}

}
