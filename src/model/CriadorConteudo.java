package model;

import java.util.ArrayList;
import java.util.List;

public class CriadorConteudo {

	private String nomeCanal;
	private List<Inscrito> inscritos;
	
	public CriadorConteudo(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	
	public CriadorConteudo() {
		this.inscritos = new ArrayList<>();
	}

	public String getNomeCanal() {
		return nomeCanal;
	}

	public void setNomeCanal(String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}

	public List<Inscrito> getInscritos() {
		return inscritos;
	}

	public void setInscritos(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}

	@Override
	public String toString() {
		return "CriadorConteudo [nomeCanal=" + nomeCanal + ", inscritos=" + inscritos + "]";
	}
	
}
