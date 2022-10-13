package br.com.voeairlines.view;
import br.com.voeairlines.bo.*;
// importa tudo que esta dentro do Swing
import javax.swing.JOptionPane;

import br.com.voeairlines.dao.*;

public class Principal {

	
	public static void main(String[] args) {
	
		
	/*ClienteBO cbo = new ClienteBO();
		
		int idade;
		
	String leiaIdade;
		
		leiaIdade = JOptionPane.showInputDialog("Entre com sua idade:");
		idade = Integer.parseInt(leiaIdade);
		
		if(idade < 18) {
			JOptionPane.showMessageDialog(null, "Embarque Não Autorizado!", 
					"VoeAirlines", 
					JOptionPane.ERROR_MESSAGE);
			
			
		}else {
			JOptionPane.showMessageDialog(null, 
					"Boa Viagem! VoeAirlines fazendo você sonhar alto!",
					"VoeAirlines",
					JOptionPane.INFORMATION_MESSAGE); 
			
			
			
			
		}*/
			
		new LoginView().setVisible(true);
		
		
		
		/*
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
		*/
		
		
		
	}

}
