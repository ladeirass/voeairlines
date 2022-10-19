 package br.com.voeairlines.model;

public class AeronaveDTO {
	
	private int id;
	private String fabricante;
	private String modelo;
	private String codigo;
	
	public AeronaveDTO() {
						
	}

	public AeronaveDTO(String fabricante, String modelo, String codigo) {
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
