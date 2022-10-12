package br.com.voeairlines.entities;

// classe POJO - Plain Old Java Objects

public class Manutencao {
	
	private int id;
	private String obeservacao;
	private String descricaoServico;
	
	public Manutencao(String obeservacao, String descricaoServico) {
		super();
		this.obeservacao = obeservacao;
		this.descricaoServico = descricaoServico;
	}

	public int getId() {
		return id;
	}

	public String getObeservacao() {
		return obeservacao;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	} 

    

}
