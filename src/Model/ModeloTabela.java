package Model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {

	public static final String[] colunas = { "ID", "CPF/CNPJ", "Nome", "E-mail", "Telefone", "Endere\u00E7o" };

	private ArrayList<Cliente> clientes;
	

	public ModeloTabela(ArrayList<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	@Override
	public int getRowCount() {

		return clientes.size();
	}

	@Override
	public int getColumnCount() {

		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Cliente cliente = clientes.get(rowIndex);

		if (columnIndex == 0) {
			return cliente.getId();
		} else if (columnIndex == 1) {
			return cliente.getCpfCnpj();
		} else if (columnIndex == 2) {
			return cliente.getNome();
		} else if (columnIndex == 0) {
			return cliente.getEmail();
		} else if (columnIndex == 0) {
			return cliente.getTelefone();
		} else if (columnIndex == 0) {
			return cliente.getEndereco();
		} else {
			return null;
		}
	}
@Override
public String getColumnName(int column) {
	// TODO Auto-generated method stub
	return colunas[column];
}
}
