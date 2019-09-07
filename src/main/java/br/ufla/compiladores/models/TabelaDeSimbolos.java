package br.ufla.compiladores.models;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
	private Map<Endereco, Identificador> simbolos;

	public TabelaDeSimbolos() {
		this.simbolos = new HashMap<Endereco, Identificador>();
	}

	public void adicionar(Identificador identificador, Endereco endereco) {
		this.simbolos.put(endereco, identificador);
	}

	// encontrar o identificador referenciado ao ENDERECO DE MEMÓRIA (olhar slides)
	// Ex: <Var, aluno> vira <Id, 11302>, sendo que 11302 está na tabela de simbolos
	// mapeado para aluno
	public Identificador getIdentificador(Endereco endereco) {
		return this.simbolos.get(endereco);
	}

	// Encontrar o endereço de uma variável que está na tabela de simbolo. Util para
	// substituir ocorrências de uma variável já mapeada
	public Endereco getEndereco(Identificador identificador) {
		for (Endereco endereco : this.simbolos.keySet()) {
			if (this.simbolos.get(endereco).equals(identificador)) {
				return endereco;
			}
		}

		return null;
	}

	public boolean contains(Endereco endereco) {
		return this.simbolos.containsKey(endereco);
	}

	public boolean contains(Identificador identificador) {
		return this.simbolos.containsValue(identificador);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(String.format("%10s|%10s|%10s|%10s|%s%n", "ID", "Line", "Row", "Type", "Name"));

		for (Endereco endereco : simbolos.keySet()) {
			Identificador identificador = simbolos.get(endereco);
			builder.append(String.format("%10d|%10d|%10d|%10s|%s%n", endereco.getValor(),
					identificador.getLocalizacao().getLinha(), identificador.getLocalizacao().getColuna(),
					identificador.getTipo().toString(), identificador.getNome()));
		}

		return builder.toString();
	}
}
