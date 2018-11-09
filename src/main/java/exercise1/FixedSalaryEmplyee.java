package exercise1;

public class FixedSalaryEmplyee extends Employee{

	private int fixedSalary;

	public FixedSalaryEmplyee (String Name, int fixedSalary) {
		super(Name); // Appeler le constructeur de la classe supérieure
		this.fixedSalary=fixedSalary;

	}

	public int computeSalary(){

		return fixedSalary;

	};




}
