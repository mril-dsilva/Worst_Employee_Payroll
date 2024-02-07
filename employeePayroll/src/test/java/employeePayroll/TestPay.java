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
	
	double aRate = 7.25;
	double bRate = 20;
	double cRate = 50;
	double dRate = 300;
	
	double hours1 = 25;
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
		Employee b = company.addEmployee(bName, bRate, 0.0, "hourly");
		Employee c = company.addEmployee(cName, cRate, 0.0, "salary");
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
		
		
		// Test paying employees
		
		
	}

}
