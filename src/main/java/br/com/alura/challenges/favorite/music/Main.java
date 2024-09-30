package br.com.alura.challenges.favorite.music;

import br.com.alura.challenges.favorite.music.models.Musica;
import br.com.alura.challenges.favorite.music.models.Podcast;
import br.com.alura.challenges.favorite.music.services.AtribuicaoService;
import br.com.alura.challenges.favorite.music.services.Preferencia;

public class Main {
	public static void main(String[] args) {
		AtribuicaoService atribuir = new AtribuicaoService();
		Preferencia preferencia = new Preferencia();

		Musica nothingElseMetters = Musica.builder()
			.titulo("Nothing Else Matters")
			.album("The Black Album")
			.cantor("James Hetfield")
			.genero("Heavy metal")
		.build();

		Podcast podcastHipsters129 = Podcast.builder()
			.titulo("Práticas de Orientação a Objetos – Hipsters #129")
			.apresentador("Paulo Silveira")
			.descricao(
    			"""
				E essa tal de orientação objetos? Código limpo? SOLID? Fácil de dar manutenção? E os design patterns? 
				Domain Driven? Tem muita coisa relacionada a esse conceito e o episódio consegue passar por vários 
				deles… mas não todos
				"""
			)
		.build();

		System.out.println("""
			Desafio Alura - Aula (Java: Aplicando a Orientação a Obsejtos
			Músicas Preferidas
			ONE G7
			"""
		);

		atribuir.curtida(nothingElseMetters, 1200);
		atribuir.reproducao(nothingElseMetters, 1200);

		atribuir.curtida(podcastHipsters129, 3000);
		atribuir.reproducao(podcastHipsters129, 3000);

		preferencia.inclui(nothingElseMetters);
		preferencia.inclui(podcastHipsters129);
	}
}