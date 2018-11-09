package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{

		private int baseSalary;
		private int commission;


	public BaseSalaryPlusCommissionEmployee (String Name, int baseSalary, int commission) {

		super(Name);
		this.baseSalary=baseSalary;
		this.commission=commission;

	}


	public int computeSalary(){

		return baseSalary + getSale() * commission;

	};

}
