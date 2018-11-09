package exercise2;

import exercise1.Exercise1;

public class Exercise2 extends Exercise1 {

	public ProductionWorker buildProductiveWorker(int salaryPerProducedPiece) {

		ProductionWorker test = new ProductionWorker(salaryPerProducedPiece);
		return test;
	}



}
