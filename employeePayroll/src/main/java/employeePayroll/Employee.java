package employeePayroll;

public class Employee {

	private String name;
	private float hourlyRate;
	private float hoursWorked;
	private PayScheme payScheme;
	
	/**
	 * @param name
	 * @param hourlyRate
	 * @param hoursWorked
	 * @param payScheme
	 */
	public Employee(String name, float hourlyRate, float hoursWorked, PayScheme payscheme) {
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.payScheme = payscheme;
	}
	
	
	public float payEmployee() {
		return payScheme.payEmployee(hourlyRate, hoursWorked);
	}
	
	public void setHoursWorked(int hours) {
		hoursWorked = hours;
	}
}
