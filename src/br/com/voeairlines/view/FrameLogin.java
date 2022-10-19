package br.com.voeairlines.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameLogin extends JFrame {



	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameLogin() {

		setUndecorated(true);
		setTitle("VoeAirlines");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(SystemColor.activeCaption, 2));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(187, 167, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);

		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsuario.getText().equals("")) {
					txtUsuario.setText("Usuario");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			if(txtUsuario.getText().equals("Username")) {
				txtUsuario.setText("");
				}
			else {
				txtUsuario.selectAll();
			}
			}
		});
		// txtUsuario.addFocusListener(new FocusAdapter() {

		/*
		 * @Override public void focusGained(FocusEvent e) { if
		 * (txtUsuario.getText().equals("Usuario")); txtUsuario.setText(""); } else {
		 * txtUsuario.selectAll(); }
		 * 
		 * });
		 */

		txtUsuario.setBorder(null);
		txtUsuario.setFont(new Font("Fira Sans Condensed Book", Font.BOLD, 14));
		txtUsuario.setText("Usúario");
		txtUsuario.setBounds(12, 12, 170, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setBounds(210, 0, 40, 40);
		lblIconUsername.setIcon(new ImageIcon());
		panel.add(lblIconUsername);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(187, 225, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		txtSenha = new JPasswordField();
		txtSenha.setText("Password");
		txtSenha.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (txtSenha.getText().equals("Senha")) {
					txtSenha.setEchoChar('*');
					txtSenha.setText("");
				} else {
					txtSenha.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtSenha.getText().equals(""))
					;
				{
					txtSenha.setText("Senha");
					txtSenha.setEchoChar((char) 0);
				}
			}
		});
		txtSenha.setEchoChar('*');
		txtSenha.setBorder(null);
		txtSenha.setBounds(12, 12, 170, 20);
		panel_1.add(txtSenha);

		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBounds(210, 0, 40, 40);
		lblIconPassword.setIcon(new ImageIcon());
		panel_1.add(lblIconPassword);

		JPanel pnlBtnEntrar = new JPanel();
		pnlBtnEntrar.setBackground(new Color(47, 79, 79));
		pnlBtnEntrar.setBounds(187, 294, 250, 50);
		contentPane.add(pnlBtnEntrar);
		pnlBtnEntrar.setLayout(null);

		JLabel lblEntrar = new JLabel("Entrar");
		lblEntrar.setForeground(Color.WHITE);
		lblEntrar.setFont(new Font("Fira Sans Condensed Book", Font.BOLD, 14));
		lblEntrar.setBounds(123, 11, 117, 28);
		pnlBtnEntrar.add(lblEntrar);

		JLabel lblx = new JLabel("X");
		lblx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Você tem certeza que você quer fechar esta aplicação",
						"Confirmar", JOptionPane.YES_NO_OPTION) == 0) {
					FrameLogin.this.dispose();
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblx.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblx.setForeground(Color.WHITE);
			}
		});
		lblx.setForeground(Color.WHITE);
		lblx.setFont(new Font("Fira Sans Condensed", Font.BOLD, 13));
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setBounds(580, 0, 20, 20);
		contentPane.add(lblx);

		/*
		 * JLabel lblIconLogo = new JLabel(""); lblIconLogo.setBounds(187, 42, 250,
		 * 111); contentPane.add(lblIconLogo); lblIconLogo.setIcon(new
		 * ImageIcon(img_logo)); setLocationRelativeTo(null);
		 */
	}
}
