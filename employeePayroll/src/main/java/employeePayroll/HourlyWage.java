package employeePayroll;

public class HourlyWage extends PayScheme {

	@Override
	public double payEmployee(double hourRate, double hoursWorked) {
		if(hoursWorked > 40) {
			double pay = hourRate * 40;
			pay += (hourRate * 1.5) * (hoursWorked - 40);
			
			return pay;
		}else{
			return hoursWorked * hourRate;
		}
	}

}
