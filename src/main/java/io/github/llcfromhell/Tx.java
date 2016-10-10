package io.github.llcfromhell;

import java.util.List;

public class Tx {
    
    private String nomeUsuario;
    private String intervalo;
	private int id;
    
    public Tx(String nomeUsuario, String intervalo) {
		this.nomeUsuario = nomeUsuario;
		this.intervalo = intervalo;
	}

	public Tx(int id, String nomeUsuario, String intervalo) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.intervalo = intervalo;
	}

	public String getNomeUsuario() {
        return this.nomeUsuario;
    }
    
    public String getIntervalo() {
        return this.intervalo;
    }

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Tx other = (Tx) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
    
    
}