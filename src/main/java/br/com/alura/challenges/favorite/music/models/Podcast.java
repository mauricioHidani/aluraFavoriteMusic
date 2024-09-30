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

	public String getApresentador() {
		return apresentador;
	}

	public String getDescricao() {
		return descricao;
	}

}
