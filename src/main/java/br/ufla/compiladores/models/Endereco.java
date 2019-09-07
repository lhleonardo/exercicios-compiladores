package br.ufla.compiladores.models;

import java.util.Random;

public class Endereco {

	private int valor;

	private static Random gerador = new Random();

	public Endereco() {
		this.valor = gerador.nextInt(500) * gerador.nextInt(500);
	}

	public int getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + valor;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (valor != other.valor)
			return false;
		return true;
	}

}
