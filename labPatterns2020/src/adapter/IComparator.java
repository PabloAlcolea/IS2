package adapter;

import java.util.Iterator;

import domain.Symptom;

public interface IComparator {
	public Iterator<Symptom> ordenar(Iterator<Symptom> l);
}
