package view;

import java.util.ArrayList;
import java.util.List;

import controller.CriadorConteudoController;
import model.CriadorConteudo;
import model.Inscrito;

public class Principal {

	public static void main(String[] args) {
		Inscrito i1 = new Inscrito();
		i1.setNome("João");
		Inscrito i2 = new Inscrito();
		i2.setNome("Maria");
		Inscrito i3 = new Inscrito();
		i3.setNome("Ana");

		List<Inscrito> inscritos = new ArrayList<>();
		inscritos.add(i1);
		inscritos.add(i2);
		inscritos.add(i3);

		CriadorConteudo criador = new CriadorConteudo(inscritos);
		criador.setNomeCanal("ENG");

		CriadorConteudoController criadorCont = new CriadorConteudoController(criador);
		criadorCont.postar("Como fazer um CRUD");

	}

}
