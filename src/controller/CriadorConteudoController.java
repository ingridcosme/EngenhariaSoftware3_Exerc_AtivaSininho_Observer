package controller;

import java.util.List;

import model.CriadorConteudo;
import model.Inscrito;

public class CriadorConteudoController implements IAvisoCriadorConteudo, IObservavel {

	private CriadorConteudo criador;
	private List<Inscrito> inscritos;
	private String acao;

	public CriadorConteudoController(CriadorConteudo criador) {
		this.criador = criador;
		this.inscritos = criador.getInscritos();
	}

	@Override
	public void postar(String titulo) {
		acao = "postado";
		System.out.println("Um novo vídeo do " + criador.getNomeCanal() + " foi postado: " + titulo);
		notifica(acao);
	}

	@Override
	public void notifica(String acao) {
		for (Inscrito inscrito : inscritos) {
			InscritoController inscritoController = new InscritoController(inscrito);
			inscritoController.update(acao);
		}
	}

}
