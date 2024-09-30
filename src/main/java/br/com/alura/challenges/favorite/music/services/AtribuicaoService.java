package br.com.alura.challenges.favorite.music.services;

public class AtribuicaoService {

	public void curtida(IAudioService audio, Integer numCurtidas) {
		for (int curtida = 0; curtida < numCurtidas; curtida++) {
			audio.curte();
		}
	}

	public void reproducao(IAudioService audio, Integer numReproducoes) {
		for (int reproducao = 0; reproducao < numReproducoes; reproducao++) {
			audio.reproduz();
		}
	}

}
