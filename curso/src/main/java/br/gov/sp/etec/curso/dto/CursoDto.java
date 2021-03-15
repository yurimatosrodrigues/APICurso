package br.gov.sp.etec.curso.dto;

import java.io.Serializable;

public class CursoDto implements Serializable{
	
	private static final long serialVersionUID = -7602151787702793501L;
	private String nome;
	private String sigla;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	
	

}
