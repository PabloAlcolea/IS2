package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;

public class ComparatorBySymptomName implements Comparator<Symptom>{

	@Override
	public int compare(Symptom s1, Symptom s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
