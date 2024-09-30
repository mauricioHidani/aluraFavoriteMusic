package br.com.alura.challenges.favorite.music.services;

import br.com.alura.challenges.favorite.music.models.Audio;

public class Preferencia {

	public void inclui(Audio audio) {
		if (audio.verifClassificacao() >= 9) {
			System.out.printf(
				"%s é considerado sucesso absoluto e um dos títulos preferidos da galera.\n",
				audio.getTitulo()
			);
			return;
		}
		System.out.printf(
			"%s é um título que todo mundo está curtindo. Não deixe de ouvir também.\n",
			audio.getTitulo()
		);
	}

}
