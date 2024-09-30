package br.com.alura.challenges.favorite.music.models;

import java.io.Serial;
import java.io.Serializable;

public class Musica extends Audio implements Serializable {

	@Serial private static final long serialVersionUID = 2390868675182131556L;

	private String album;
	private String cantor;
	private String genero;

	public Musica(String titulo, Integer totalReproducoes, Integer totalCurtidas, Integer classificacao, String album,
				  String cantor, String genero) {
		super(titulo, totalReproducoes, totalCurtidas, classificacao);
		this.album = album;
		this.cantor = cantor;
		this.genero = genero;
	}

	public Musica(MusicaBuilder builder) {
		super(builder.titulo, builder.totalReproducoes, builder.totalCurtidas, builder.classificacao);
		this.album = builder.album;
		this.cantor = builder.cantor;
		this.genero = builder.genero;
	}

	public static MusicaBuilder builder() {
		return new MusicaBuilder();
	}

	@Override
	public Integer verifClassificacao() {
		if (getTotalReproducoes() > 2000) {
			setClassificacao(10);
		}
		else {
			setClassificacao(8);
		}
		return getClassificacao();
	}

	public String getAlbum() {
		return album;
	}

	public String getCantor() {
		return cantor;
	}

	public String getGenero() {
		return genero;
	}

	public static class MusicaBuilder {
		private String titulo;
		private Integer totalReproducoes;
		private Integer totalCurtidas;
		private Integer classificacao;
		private String album;
		private String cantor;
		private String genero;

		public MusicaBuilder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}

		public MusicaBuilder totalReproducoes(Integer totalReproducoes) {
			this.totalReproducoes = totalReproducoes;
			return this;
		}

		public MusicaBuilder totalCurtidas(Integer totalCurtidas) {
			this.totalCurtidas = totalCurtidas;
			return this;
		}

		public MusicaBuilder classificacao(Integer classificacao) {
			this.classificacao = classificacao;
			return this;
		}

		public MusicaBuilder album(String album) {
			this.album = album;
			return this;
		}

		public MusicaBuilder cantor(String cantor) {
			this.cantor = cantor;
			return this;
		}

		public MusicaBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}


		public Musica build() {
			totalReproducoes = totalReproducoes == null ? 0 : totalReproducoes;
			totalCurtidas = totalCurtidas == null ? 0 : totalCurtidas;
			classificacao = classificacao == null ? 0 : classificacao;

			return new Musica(
				titulo,
				totalReproducoes,
				totalCurtidas,
				classificacao,
				album,
				cantor,
				genero
			);
		}
	}

}
