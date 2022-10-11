package lab3_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the <code>Employee</code>
 * 
 * @author Stella Kazamia
 */
public class EmployeeJTest {

	/**
	 * Test accessors and mutators for an employee.
	 */
	@Test
	public void lab3_testAccessorsMutators() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(100000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Director");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		// Test the fields.
		assertEquals(1234, employee.getId());
		assertEquals("Sid", employee.getForename());
		assertEquals("James", employee.getSurname());
		assertEquals(100000, employee.getSalary(), 0);
		assertEquals("Director", employee.getPositionName());
	}

	/**
	 * Test accessors and mutators for an employee.
	 */
	@Test
	public void lab3_testAccessorsMutatorsNew() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(0);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Volunteer");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		// Test the fields.
		assertEquals(1234, employee.getId());
		assertEquals("Sid", employee.getForename());
		assertEquals("James", employee.getSurname());
		assertEquals(0, employee.getSalary(), 0);
		assertEquals("Volunteer", employee.getPositionName());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecord() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(100000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Director");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("James, Sid (1234): Director at £100000.0 (£27500.0 tax) and is eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNew() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(150000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Teaching Fellow");

		Employee employee = new Employee(1234, "Stella", "Kazamia", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Kazamia, Stella (1234): Teaching Fellow at £150000.0 (£47500.0 tax) and is eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNoBonus() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(39999.0);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Sales Person");

		Employee employee = new Employee(5678, "Joe", "Bloggs", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Bloggs, Joe (5678): Sales Person at £39999.0 (£5499.8 tax) and is not eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNoBonusNew() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(17000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Teacher");

		Employee employee = new Employee(5678, "Joe", "Bloggs", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Bloggs, Joe (5678): Teacher at £17000.0 (£900.0 tax) and is not eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNoBonusNoSalary() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(0);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Volunteer");

		Employee employee = new Employee(5678, "Bob", "Ross", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Ross, Bob (5678): Volunteer at £0.0 (£0.0 tax) and is not eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNoBonusOnly20() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(10000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Volunteer");

		Employee employee = new Employee(5678, "Alice", "Ross", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Ross, Alice (5678): Volunteer at £10000.0 (£0.0 tax) and is not eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void lab3_testDisplayRecordNoBonus20And40() {
		// Create an employee.
		AnnualSalary salary = new AnnualSalary();
		salary.setSalary(33000);

		Position companyPosition = new Position();
		companyPosition.setRoleName("Teacher");

		Employee employee = new Employee(5678, "Alice", "Wonderland", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Wonderland, Alice (5678): Teacher at £33000.0 (£4100.0 tax) and is not eligible for bonus.",
				employee.toString());
	}

}