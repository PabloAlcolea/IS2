package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import domain.Symptom;

public class ComparatorBySymptomName implements IComparator{

	@Override
	public Iterator<Symptom> ordenar(Iterator<Symptom> l) {
		List<Symptom> symptomList = new ArrayList<Symptom>();
		
		while (l.hasNext()) {
			Symptom s = (Symptom) l.next();
			symptomList.add(s);
		}
		
		symptomList.sort(Comparator.comparing(Symptom :: getName));
		
		return symptomList.iterator();
	}
}
