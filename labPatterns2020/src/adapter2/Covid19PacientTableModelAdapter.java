package adapter2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };
	protected ArrayList<Symptom> symptomList;

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
		this.symptomList = new ArrayList<Symptom>(p.getSymptoms());
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		return pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		Symptom symptom = symptomList.get(row);
		if (col == 0) {
			return symptom.getName();
		} else if (col == 1) {
			return symptom.getSeverityIndex();
		} else {
			return null;
		}
	}
}
