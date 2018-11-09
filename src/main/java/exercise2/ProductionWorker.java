package exercise2;

public class ProductionWorker implements Payable{

	private int producedPieceRate;
	private int producedpiece = 0;


	public ProductionWorker(int producedPieceRate){
		this.producedPieceRate=producedPieceRate;
	}


	public void produceOnePiece() {
		producedpiece++;
	}

	public int computeSalary() {
		return producedPieceRate * producedpiece;
	}
}
