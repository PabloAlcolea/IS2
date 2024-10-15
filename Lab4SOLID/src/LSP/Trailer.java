package LSP;

public class Trailer extends TransportationDevice implements Matriculado {
	Matricula matricula;
	
	public Trailer(String name, double speed, Matricula matricula) {
        this.name = name;
        this.speed = speed;
        this.matricula = matricula;
    }
	
	@Override
	public void matricular() {
		System.out.println("La matrícula del remolque es: " + matricula);
	}

	@Override
	public void move() {
		System.out.println("El remolque se está moviendo a " + speed + " km/h.");
	}

}
