package adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientAdapter implements InvertedIterator{
	
	private List<Symptom> symptoms;
	private int currentPosition;
	
	public Covid19PacientAdapter(Covid19Pacient p) {
		this.symptoms = new ArrayList<>(p.getSymptoms());
		Collections.reverse(this.symptoms);
		this.currentPosition = this.symptoms.size() - 1;
	}

	@Override
	public Object previous() {
		if (hasPrevious()) {
			return symptoms.get(currentPosition--);
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return currentPosition >= 0;
	}

	@Override
	public void goLast() {
		currentPosition = symptoms.size() - 1;
	}

}
