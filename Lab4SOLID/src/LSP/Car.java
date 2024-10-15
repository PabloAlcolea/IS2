package LSP;

public class Car extends TransportationDevice implements EnginedDevice, Matriculado {
	public Engine engine;
	public Matricula matricula;
	
	public Car(String name, double speed, Engine engine, Matricula matricula) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
        this.matricula = matricula;
    }
	
	@Override
	public void startEngine() {
		System.out.println("Motor coche arrancado.");
	}

	@Override
	public void move() {
		System.out.println("El coche se está moviendo a " + speed + " km/h.");
	}

	@Override
	public void matricular() {
		System.out.println("La matrícula del coche es: " + matricula);
	}
}
