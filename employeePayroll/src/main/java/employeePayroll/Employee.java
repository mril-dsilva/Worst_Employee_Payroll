package employeePayroll;

public class Employee {

	private String name;
	private double hourlyRate;
	private double hoursWorked;
	private PayScheme payScheme;
	
	/**
	 * @param name
	 * @param hourlyRate
	 * @param hoursWorked
	 * @param payScheme
	 */
	public Employee(String name, double hourlyRate, double hoursWorked, PayScheme payscheme) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.payScheme = payscheme;
	}
	
	
	public double payEmployee() {
		return payScheme.payEmployee(hourlyRate, hoursWorked);
	}
	
	public String getName() {
		return name;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHoursWorked(double hours) {
		hoursWorked = hours;
	}
	
	public double setHoursWorked() {
		return hoursWorked;
	}
}
