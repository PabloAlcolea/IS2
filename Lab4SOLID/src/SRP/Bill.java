package SRP;

import java.util.Date;

public class Bill {
	public String code; // Representa un número de 5 dígitos
	public Date date;
	public float InitialAmount;
	public float totalVAT;
	public float totalDeduction;
	public float billTotal;
	public int deductionPercentage;
	Deduccion d = new Deduccion();
	IVA iva = new IVA();
	float VAT;

	// Método que calcula el total de la factura
	public void billTotalCalc() {
		
		billTotal = (InitialAmount - d.calculateDeduction(InitialAmount, deductionPercentage)) + 
				iva.calculateVAT(InitialAmount, VAT);
	}
}
