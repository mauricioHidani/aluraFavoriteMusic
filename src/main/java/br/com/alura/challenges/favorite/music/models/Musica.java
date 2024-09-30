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

	public String getAlbum() {
		return album;
	}

	public String getCantor() {
		return cantor;
	}

	public String getGenero() {
		return genero;
	}

}
