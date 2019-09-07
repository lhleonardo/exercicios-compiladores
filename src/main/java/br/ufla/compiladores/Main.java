package br.ufla.compiladores;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import br.ufla.compiladores.antlr.Scanner;
import br.ufla.compiladores.models.Endereco;
import br.ufla.compiladores.models.Identificador;
import br.ufla.compiladores.models.Localizacao;
import br.ufla.compiladores.models.TabelaDeSimbolos;
import br.ufla.compiladores.models.TipoIdentificador;

public class Main {
	private static TabelaDeSimbolos simbolos = new TabelaDeSimbolos();
	private static Scanner scanner;

	public static void percorreTokens() {

		List<? extends Token> tokens = scanner.getAllTokens();

		Token atual = null;
		for (Iterator<? extends Token> iterator = tokens.iterator(); iterator.hasNext();) {
			atual = iterator.next();
			if (atual.getType() == Scanner.ALGORITMO)
				break;

			if (atual.getType() == Scanner.IDENTIFICADOR) {
				String nome = atual.getText();
				Localizacao localizacao = Localizacao.of(atual.getLine(), atual.getCharPositionInLine());

				// ignora o delimitador <:>
				iterator.next();
				atual = iterator.next();

				if (atual.getType() == Scanner.DELIMITADOR) {
					throw new RuntimeException("Declaração inválida de um tipo. Ex: identificador: TIPO;");
				}

				Identificador identificador = new Identificador(nome, TipoIdentificador.valueOf(atual.getText()));
				identificador.setLocalizacao(localizacao);

				Main.simbolos.adicionar(identificador, new Endereco());
			}

		}

	}

	private static void imprimeTabela() {
		System.out.println(simbolos);
	}

	public static void main(String[] args) throws IOException, URISyntaxException {
		CharStream stream = CharStreams.fromPath(Path.of(Main.class.getResource("teste.alguma").toURI()));
		scanner = new Scanner(stream);
		percorreTokens();
		imprimeTabela();
	}
}
