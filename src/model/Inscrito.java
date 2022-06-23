package model;

public class Inscrito {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Inscrito [nome=" + nome + "]";
	}
	
}
