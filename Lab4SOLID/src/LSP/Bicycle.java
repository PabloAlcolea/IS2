package LSP;

public class Bicycle extends TransportationDevice {
	
	public Bicycle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

	@Override
	public void move() {
		System.out.println("La bicicleta se está moviendo a " + speed + " km/h.");
	}
}
