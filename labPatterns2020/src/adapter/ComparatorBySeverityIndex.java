package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;

public class ComparatorBySeverityIndex implements Comparator<Object>{

//	@Override
	public int compareSymptom(Symptom s1, Symptom s2) {
		return Integer.compare(s1.getSeverityIndex(), s2.getSeverityIndex());
	}

	@Override
	public int compare(Object o1, Object o2) {
		return this.compareSymptom((Symptom) o1, (Symptom) o2);
	}
}
