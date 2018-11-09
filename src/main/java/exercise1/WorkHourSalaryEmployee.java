package exercise1;

public class WorkHourSalaryEmployee extends Employee {

	private int hourRate;


	public WorkHourSalaryEmployee (String Name,int hourRate) {
		super(Name); // Appeler le constructeur de la classe supérieure
		this.hourRate=hourRate;

	}

	public int computeSalary(){

		return hourRate*getWorkedHours();
	};



}
