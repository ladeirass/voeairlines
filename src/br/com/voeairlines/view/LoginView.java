package br.com.voeairlines.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {

	// private JPanel contentPane;
	JButton btnLimpar;
	JButton btnEntrar;
	JTextField txtUsuario;
	JTextField txtAviso;
	JPasswordField pwfSenha;
	JLabel lblUsuario;
	JLabel lblSenha;
	JPanel panel;
	JFrame janela;
	CardLayout cards;

	public LoginView() {
		super("VoeAirlines");


		setVisible(true);
		setSize(450, 350);
//		setLayout(new GridLayout(3,3)); 
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		
		
		add(new JLabel("Usúario: "), gbc);		
		
		
		//lblUsuario = new JLabel("Usuário:  ");
		gbc.gridy++;
		
		add(new JLabel("Senha: "), gbc);
		gbc.gridy++;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		add((txtUsuario = new JTextField(10)), gbc);
		

	//	txtUsuario = new JTextField(15);
	//	add(txtUsuario);

	//	lblSenha = new JLabel("Senha:    ");
	//	add(lblSenha);
		
		
		pwfSenha = new JPasswordField(15); // caixa da senha 
		add(pwfSenha);

		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				if (evento.getSource() == btnEntrar)
					if (txtUsuario.getText().equals("senai") && pwfSenha.getText().equals("123"))
						JOptionPane.showMessageDialog(null, "Parabens");
					else
						JOptionPane.showMessageDialog(null, "Senha errada");
			}
		});
		add(btnEntrar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evento) {
				if (evento.getSource() == btnLimpar) {
					txtUsuario.setText("");
					pwfSenha.setText("");
				}

			}
		});
		add(btnLimpar);

		//JPanel panel = new JPanel();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
