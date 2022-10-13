package br.com.voeairlines.model;

public class PilotoDTO {
	
	private int id;
	private String nome;
	private String matricula;
	
	public  PilotoDTO() {
		
	}
	
	public PilotoDTO(String nome,String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}
	
	
}
