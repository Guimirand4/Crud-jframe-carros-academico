package br.senac.sp.projetopoo.tablemodel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.senac.sp.projetopoo.modelo.Produto;

public class ProdutoTableModel extends AbstractTableModel {
    private List<Produto> lista;
    private String[] cabecalho = {"Id", "Nome", "Preço", "Marca"};
    
    public ProdutoTableModel(List<Produto> produtos) {
        this.lista = produtos;
    }
    
    public void setLista(List<Produto> produtos) {
        this.lista = produtos;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: // Id
                return produto.getId();
            case 1: // Nome
                return produto.getNome();
            case 2: // Preço
                return produto.getPreco(); // Certifique-se de que o modelo Produto tem o método getPreco()
            case 3: // Marca
                return produto.getMarca().getNome(); // Certifique-se de que o modelo Marca tem o método getNome()
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return cabecalho[column];
    }

	public void setRowCount(int i) {
		// TODO Auto-generated method stub
		
	}

	public void addRow(Object[] objects) {
		// TODO Auto-generated method stub
		
	}
}
