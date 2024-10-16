package DIP;

public class Deduction implements DeductionCalculator{

	public float calc(float initialAmount, int deductionPercentage) {
		return (initialAmount * deductionPercentage) / 100;
	}

}
