package exercise1;


import exercise2.Payable;

public abstract class Employee implements Payable {


	private final String Name ; // Le nom ne plus changer une fois affectée =cst
	private int Sale = 0;
	private int workedHours = 0;

	protected Employee(String Name){
		this.Name=Name;
	}

	//public abstract int computeSalary();


	public void sell() {  Sale++;}

	public void workOneHour() { workedHours++;}

	public String getName() {
		return this.Name;
	}

	public int getSale() {
		return Sale;
	}

	public int getWorkedHours() {
		return workedHours;
	}
}

