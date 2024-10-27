package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setVisible(true);
		
		Covid19Pacient pacient2 = new Covid19Pacient("irati", 44);
		
		pacient2.addSymptomByName("dolor de garganta", 2);
		pacient2.addSymptomByName("disnea", 1);
		pacient2.addSymptomByName("fiebre", 2);
		pacient2.addSymptomByName("escalofrios", 3);
		
		ShowPacientTableGUI gui2 = new ShowPacientTableGUI(pacient2);
		gui2.setVisible(true);


	}

}
