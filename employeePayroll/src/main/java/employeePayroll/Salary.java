package employeePayroll;

public class Salary extends PayScheme {

	@Override
	public double payEmployee(double hourRate, double hoursWorked) {
		// TODO Auto-generated method stub
		return hourRate * 40;
	}

}
