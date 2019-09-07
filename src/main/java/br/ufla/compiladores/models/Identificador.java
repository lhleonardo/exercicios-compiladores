package br.ufla.compiladores.models;

public class Identificador {

	private String nome;
	private TipoIdentificador tipo;

	private Localizacao localizacao;

	public Identificador(String nome, TipoIdentificador tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public String getNome() {
		return nome;
	}

	public TipoIdentificador getTipo() {
		return tipo;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Identificador other = (Identificador) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}
