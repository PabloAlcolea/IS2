package DIP;

import java.util.Date;

public class Bill {
	
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float initialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	public VATCalculator vatCalc;
	public DeductionCalculator deductionCalc;

	// Método que calcula el total de la factura
	public void billTotalCalc() {
		// Calculamos la deducción
		totalDeduction = deductionCalc.calc(initialAmount, deductionPercentage);
		// Calculamos el IVA
		totalVAT = vatCalc.calc(initialAmount);
		// Calculamos el total
		billTotal = (initialAmount - totalDeduction) + totalVAT;
	}
}