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
import javax.swing.UIManager;

public class FrameLogin extends JFrame {

	// private Image imglogo = new
	// ImageIcon(FrameLogin.class.getResource("res/aviaoicon.png")).getImage().getScaledInstance(90,
	// 90, Image.SCALE_SMOOTH);
	// private Image imguser = new
	// ImageIcon(FrameLogin.class.getResource("res/user.png")).getImage().getScaledInstance(90,
	// 90, Image.SCALE_SMOOTH);
	// private Image imgsenha = new
	// ImageIcon(FrameLogin.class.getResource("res/key.png")).getImage().getScaledInstance(90,
	// 90, Image.SCALE_SMOOTH);
	// private Image imglogin = new
	// ImageIcon(FrameLogin.class.getResource("res/senha.png")).getImage().getScaledInstance(90,
	// 90, Image.SCALE_SMOOTH);*/

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
				if (txtUsuario.getText().equals("Usúario")) {
					txtUsuario.setText("");
				} else {
					txtUsuario.selectAll();
				}
			}
		});

		txtUsuario.setBorder(null);
		txtUsuario.setFont(new Font("Fira Sans Condensed Book", Font.BOLD, 14));
		txtUsuario.setText("Usúario");
		txtUsuario.setBounds(12, 12, 170, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setBounds(210, 0, 40, 40);
		// lblIconUsername.setIcon(new ImageIcon(imguser));
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
				txtSenha.setText("Senha");
				txtSenha.setEchoChar((char) 0);
			}

		});
		txtSenha.setBorder(null);
		txtSenha.setEchoChar((char) 0);
		txtSenha.setFont(new Font("Fira Sans Condensed Book", Font.BOLD, 14));
		txtSenha.setText("Senha");
		txtSenha.setBounds(12, 12, 170, 20);
		panel_1.add(txtSenha);

		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBounds(210, 0, 40, 40);
		// lblIconPassword.setIcon(new ImageIcon(imgsenha));
		panel_1.add(lblIconPassword);

		JPanel pnlBtnEntrar = new JPanel();
		pnlBtnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnEntrar.setBackground(new Color(30, 60, 60));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnEntrar.setBackground(new Color(47, 79, 79));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnEntrar.setBackground(new Color(60, 80, 80));

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnEntrar.setBackground(new Color(30, 60, 60));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsuario.getText().equals("senai") && txtSenha.getText().equals("123")) {
				//pedir a entrada dos dados oelo teclado, é o mais correto

				}
			}
		});

		pnlBtnEntrar.setBackground(new Color(47, 79, 79));
		pnlBtnEntrar.setBounds(187, 304, 250, 50);
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

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.shadow"));
		panel_2.setBounds(187, 93, 250, 62);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("VoeAirlines");
		lblNewLabel.setFont(new Font("Noto Sans Mono CJK KR", Font.BOLD, 25));
		lblNewLabel.setBounds(50, 0, 143, 61);
		panel_2.add(lblNewLabel);

		JLabel lblLoginMensagem = new JLabel("New label");
		lblLoginMensagem.setForeground(new Color(220, 20, 60));
		lblLoginMensagem.setFont(new Font("Fira Sans Book", Font.BOLD, 12));
		lblLoginMensagem.setBounds(187, 277, 250, 15);
		contentPane.add(lblLoginMensagem);
	}
}
