package factory;

import factory.Covid19Pacient;
import factory.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, new SymptomFactory());
		new PacientSymptomGUI(p1);
		
		Medicament m1=new Medicament("ibuprofeno", new SymptomFactory());
		new MedicalGUI(m1);

	}

}
