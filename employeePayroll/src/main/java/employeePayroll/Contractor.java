package employeePayroll;

public class Contractor extends PayScheme {

	@Override
	public double payEmployee(double hourRate, double hoursWorked) {
		return hourRate * hoursWorked;
	}

}
