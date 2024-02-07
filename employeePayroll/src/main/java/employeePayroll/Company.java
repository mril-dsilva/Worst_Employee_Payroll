package employeePayroll;

import java.util.ArrayList;

public class Company {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public double[] payAllEmployees() {
		int employee_len = employees.size();
		
		double[] pay = new double[employee_len];
		
		for(int i = 0; i < employee_len; i++) {
			pay[i] = employees.get(i).payEmployee();
		}
		
		return pay;
	}
	
	public Employee addEmployee(String name, double hourlyRate, double hoursWorked, String paySchemeString) {
		PayScheme payScheme;
		
		if(paySchemeString == "contractor") {
			payScheme = new Contractor();
		}else if(paySchemeString == "hourly") {
			payScheme = new HourlyWage();
		}else if(paySchemeString == "salary") {
			payScheme = new Salary();
		}else {
			return null;
		}
		
		Employee employee = new Employee(name, hourlyRate, hoursWorked, payScheme);
		
		employees.add(employee);
		
		return employee;
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}

}
