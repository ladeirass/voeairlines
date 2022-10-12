package br.com.voeairlines.entities;

public class Aeronave {
	
	private int id;
	private String fabricante;
	private String modelo;
	private String codigo;
	
	public Aeronave() {
						
	}

	public Aeronave(String fabricante, String modelo, String codigo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	   
	
}
