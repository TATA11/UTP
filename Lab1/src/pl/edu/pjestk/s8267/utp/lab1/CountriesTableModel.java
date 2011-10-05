package pl.edu.pjestk.s8267.utp.lab1;

import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CountriesTableModel implements TableModel {

	private List<Country> data;
	private String[] columns = new String[] {"Państwo", "Stolica", "Populacja", "Flaga"};

	public CountriesTableModel(List<Country> list) {
		this.data = list;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
		case 0:
		case 1:
		case 3:
			return String.class;
		default:
			return Integer.class;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return data.get(rowIndex).getName();
		case 1:
			return data.get(rowIndex).getCapitol();
		case 2:
			return data.get(rowIndex).getPopulation();
		case 3:
			return data.get(rowIndex).getCountryCode();
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}