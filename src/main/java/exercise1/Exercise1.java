package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {

		Employee test =new FixedSalaryEmplyee(name,fixedSalary);
		return test;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {

		Employee test2 = new BaseSalaryPlusCommissionEmployee(name, baseSalary,commission);
			return test2;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {

		Employee test3 = new WorkHourSalaryEmployee(name, hourlyRoute);
		return test3;
	}
}
