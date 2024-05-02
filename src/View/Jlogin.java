package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Criptografia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jlogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jlogin frame = new Jlogin();
					frame.setLocationRelativeTo(null);
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
	public Jlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(57, 11, 319, 239);
		contentPane.add(panel);
		panel.setLayout(null);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(35, 94, 213, 20);
		panel.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(35, 69, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 125, 46, 14);
		panel.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Criptografia criptografia = new Criptografia("123456", Criptografia.MD5);
				System.out.println(criptografia.criptografar());
				if (textFieldUsuario.getText() != null && !textFieldUsuario.getText().isEmpty()
						&& passwordField.getText() != null && !passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton, "Informações validas");
					dispose();
					Jprincipal Jprincipal = new Jprincipal();
					Jprincipal.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(btnNewButton, "Verifique as informações", "Aviso",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(35, 193, 89, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Bem Vindo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(119, 11, 108, 14);
		panel.add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setBounds(35, 151, 213, 20);
		panel.add(passwordField);
	}
}
