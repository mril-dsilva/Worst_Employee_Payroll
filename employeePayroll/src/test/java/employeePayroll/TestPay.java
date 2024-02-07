package employeePayroll;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPay {

	Company company;
	String aName = "Adam Adamsson";
	String bName = "Billy Bob";
	String cName = "Christa Cod";
	String dName = "Doug DeWitt";
	String eName = "Eddie Ehrler";
	
	double aRate = 7.25;
	double bRate = 20;
	double cRate = 50;
	double dRate = 300;
	double eRate = 3;
	
	double hours1 = 22.5;
	double hours2 = 40;
	double hours3 = 70;
	double hours4 = 0;
	
	@BeforeEach
	void setUp() {
		company = new Company();
	}
	
	@Test
	void test() {
		// Test employee adding
		Employee a = company.addEmployee(aName, aRate, 0.0, "contractor");
		Employee b = company.addEmployee(bName, bRate, hours1, "hourly");
		Employee c = company.addEmployee(cName, cRate, hours2, "salary");
		Employee d = company.addEmployee(dName, dRate, 0.0, "salary");
		
		// Test name
		assertEquals(aName, a.getName());
		assertEquals(bName, b.getName());
		assertEquals(cName, c.getName());
		assertEquals(dName, d.getName());
		
		// Test pay
		assertEquals(aRate, a.getHourlyRate());
		assertEquals(bRate, b.getHourlyRate());
		assertEquals(cRate, c.getHourlyRate());
		assertEquals(dRate, d.getHourlyRate());
		
		ArrayList<Employee> employees = company.getEmployees();
		
		assertEquals(a, employees.get(0));
		assertEquals(b, employees.get(1));
		assertEquals(c, employees.get(2));
		assertEquals(d, employees.get(3));
		
		// Test hours setting
		assertEquals(hours4, a.getHoursWorked());
		assertEquals(hours1, b.getHoursWorked());
		assertEquals(hours2, c.getHoursWorked());
		
		a.setHoursWorked(hours1);
		b.setHoursWorked(hours2);
		c.setHoursWorked(hours3);
		
		assertEquals(hours1, a.getHoursWorked());
		assertEquals(hours2, b.getHoursWorked());
		assertEquals(hours3, c.getHoursWorked());
		
		a.setHoursWorked(hours4);
		
		assertEquals(hours4, a.getHoursWorked());
		
		a.setHoursWorked(hours1);
		d.setHoursWorked(hours4);
		
		// Test paying employees
		double[] pay = company.payAllEmployees();
		
		assertEquals(163.125, pay[0]);
		assertEquals(800, pay[1]);
		assertEquals(2000, pay[2]);
		assertEquals(12000, pay[3]);
		
		// Make sure the returned array is the same length as the number of given employees
		assertEquals(4, pay.length);
		
		// Add in new hours worked to test how the different pay schemes work above or below 40 hours, as well as show that it can work with a 
		// different number of people
		Employee e = company.addEmployee(eName, eRate, 0, "hourly");
		
		a.setHoursWorked(hours3);
		b.setHoursWorked(hours3);
		c.setHoursWorked(hours2);
		d.setHoursWorked(hours1);
		e.setHoursWorked(hours2);
		
		pay = company.payAllEmployees();
		
		assertEquals(507.5, pay[0]);
		assertEquals(1700, pay[1]);
		assertEquals(2000, pay[2]);
		assertEquals(12000, pay[3]);
		assertEquals(120, pay[4]);
		
		// Make sure the returned array is the same length as the number of given employees
		assertEquals(5, pay.length);
	}
}