package LSP;

public class Skate extends TransportationDevice implements EnginedDevice {
	public Engine engine;

	public Skate(String name, double speed, Engine engine) {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }
	
	@Override
	public void startEngine() {
		System.out.println("Motor patinete arrancado.");
	}

	@Override
	public void move() {
		System.out.println("El patinete se está moviendo a " + speed + " km/h.");
	}
}
