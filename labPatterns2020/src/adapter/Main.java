package adapter;

import java.util.Iterator;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("fatiga", 10, 5), 1);
        p.addSymptom(new Symptom("tos", 8, 7), 2);
        p.addSymptom(new Symptom("fiebre", 9, 9), 3);
        p.addSymptom(new Symptom("dolor de cabeza", 6, 4), 4);
        p.addSymptom(new Symptom("dificultad para respirar", 10, 10), 5);
        
         
		
		Covid19PacientAdapter invertedIterator = new Covid19PacientAdapter(p);
		
		System.out.println("Síntomas ordenados por nombre: \n");
		Iterator<Object> sortName = Sorting.sortedIterator(invertedIterator, new ComparatorBySymptomName());
		int count = 0;
		
		while(sortName.hasNext() && count < 5) {
			Symptom s = (Symptom) sortName.next();
			System.out.println(s.getName() + "\n");
			count++;
		}
		
		invertedIterator.goLast();
		
		System.out.println("\n");
		System.out.println("Síntomas ordenados por índice de severidad: \n");
		Iterator<Object> sortInd = Sorting.sortedIterator(invertedIterator, new ComparatorBySeverityIndex());
		count = 0;
		
		while(sortInd.hasNext() && count < 5) {
			Symptom s = (Symptom) sortInd.next();
			System.out.println(s.getName() + " - Severidad: " + s.getSeverityIndex() + "\n");
			count++;
		}
	}
}

