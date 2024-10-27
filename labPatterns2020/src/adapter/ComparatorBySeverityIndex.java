package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;

public class ComparatorBySeverityIndex implements Comparator<Symptom>{

	@Override
	public int compare(Symptom s1, Symptom s2) {
		return Integer.compare(s1.getSeverityIndex(), s2.getSeverityIndex());
	}
}
