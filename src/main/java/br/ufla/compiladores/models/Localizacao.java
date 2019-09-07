package br.ufla.compiladores.models;

public class Localizacao {

	private int linha;
	private int coluna;

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	private Localizacao(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	public static Localizacao of(int linha, int coluna) {
		return new Localizacao(linha, coluna);
	}
}
