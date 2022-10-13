package br.com.voeairlines.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginView extends JFrame implements ActionListener{
	
	JButton btnLimpar;
	JButton btnVerificar;
	JTextField txtUsuario;
	JPasswordField pwfSenha;
	JLabel lblUsuario;
	JLabel lblSenha;
	
	public LoginView() {
		setTitle("Sistema VoeAirlines");
		setSize(500,100);
		setResizable(false);
//		Gerenciador de layaout - awt
		getContentPane().setLayout(new GridLayout(3, 2)); // Duas linhas duas colunas

//	Objeto == É uma instancia de uma classe
	
	
		btnLimpar = new JButton("Limpar");
		btnVerificar = new JButton("Verificar");
		txtUsuario = new JTextField(20);
		pwfSenha = new JPasswordField(20);
		lblUsuario = new JLabel("Usuário");
		lblSenha = new JLabel("Senha");
		pwfSenha.setEchoChar('*');
		
		
		getContentPane().add(lblUsuario);
		getContentPane().add(txtUsuario);
		getContentPane().add(lblSenha);
		getContentPane().add(pwfSenha);
		getContentPane().add(btnVerificar);
		getContentPane().add(btnLimpar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
