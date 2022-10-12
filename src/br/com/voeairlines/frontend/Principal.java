package br.com.voeairlines.frontend;

import br.com.voeairlines.dao.AeronaveDAO;
import br.com.voeairlines.entities.*;
import br.com.voeairlines.dao.*;

public class Principal {

	public static void main(String[] args) {

		Aeronave aronave = new Aeronave("Embraer", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aronave));
		
		Aeronave aronave2 = new Aeronave("Embraer", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO2 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aronave));
		
		Aeronave aronave3 = new Aeronave("Embraer", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO3 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aronave));
		
		Aeronave aronave4 = new Aeronave("Embraer", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO4 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aronave));
		
		Aeronave aronave5 = new Aeronave("Embraer", "Bandeirante", "EMB-100");
		AeronaveDAO aeronaveDAO5 = new AeronaveDAO();
		System.out.println(aeronaveDAO.cadastrarAeronave(aronave));
		
		Manutencao manutencao = new Manutencao("Troca de óleo da proxima revisão", "revisão do motor direito");
		System.out.println(new ManutencaoDAO().cadastrarManutencao(manutencao));
		
		
		
		
		
	}

}
