package DIP;

public class VAT implements VATCalculator {
	
	public float percentage = 0.21f;
	
	public float calc(float initialAmount) {
		return (initialAmount * percentage);
	}
	
}
