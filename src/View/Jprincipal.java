package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Cliente;
import Model.ModeloTabela;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Jprincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ArrayList<Cliente> clientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jprincipal frame = new Jprincipal();
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
	public Jprincipal() {
		clientes = new ArrayList<>();
		clientes.add(new Cliente("1", "João", "joãosilva@gmail.com","234.990.948-50", "4002-8922", "Não informado" ));
		clientes.add(new Cliente("2", "Gabriela", "gabrielaa@gmail.com","234.990.778-22", "9945-8922", "Não informado" ));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(20, 14, 109, 20);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(139, 14, 271, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 62, 704, 322);
		contentPane.add(scrollPane);
		ModeloTabela modeloTabela = new ModeloTabela(clientes);
		
		
		table = new JTable();
		table.setModel(modeloTabela);
		scrollPane.setViewportView(table);
	}
}
