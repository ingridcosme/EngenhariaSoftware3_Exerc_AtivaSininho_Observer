package controller;

import model.Inscrito;

public class InscritoController implements IAvisoInscrito, IObservador {

	private Inscrito inscrito;
	
	public InscritoController(Inscrito inscrito) {
		this.inscrito = inscrito;
	}

	@Override
	public void ativaSininho() {
		System.out.println(inscrito.getNome() + " h� um novo v�deo para assistir");
	}

	@Override
	public void update(String acao) {
		if (acao.equals("postado")) {
			ativaSininho();
		}
	}

}
