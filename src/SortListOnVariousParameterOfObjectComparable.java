import java.util.ArrayList;
import java.util.Collections;

/*Given a list of custom objects , sort the list based on various parameter of the object. 
Suppose you have list of employee object then sort the list based on name , salary etc.*/
public class SortListOnVariousParameterOfObjectComparable {
	
public static void main(String args[]) {
	
	ArrayList<Employee> list= new ArrayList<>();
	list.add(new Employee("Sanskar",46041034,200000));
	list.add(new Employee("Mrinal",45239365,24334535));
	Collections.sort(list);
	for(Employee e: list) {
		System.out.println(e);
	}
	
}

/*
 * Comparable is an interface available in java.lang package, which provides
 * single sorting(means we can sort either the basis of id or name at a time.
 * 
 * The Comparable interface contains compare() method. If we want to sort any
 * collection of user-defined objects using comparable, our java class must need
 * to implement Comparable interface and override compareTo(Object o) method.
 */
/*
 * WHY IS EMPLOYEE CLASS STATIC?
 * SUPPOSE, You've declared the class EMPLOYEE as a non-static inner class. That means it must be associated with an instance of the SortListOnVariousParameterOfObject class.
So if you create an object of EMPLOYEE, you're trying to create an instance of EMPLOYEE from a static context. That is what the compiler is complaining about.
There are a few possible solutions. Which solution to use depends on what you want to achieve.
SOLUTION1: Move EMPLOYEE out of the SortListOnVariousParameterOfObject class.
SOLUTION2: Change Thing to be a static nested class.
I have made it static here, so that there is no issue when creating an object.
 */
public static class Employee implements Comparable<Employee>{

	private String empName;
	private int empId;
	private int salary;

	public Employee(String empName, int empId, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * Sorting ArrayList with Comparable:
	 * 
	 * The custom object type class which is Student here will implement the
	 * Comparable class<Student>. This will override the compareTo() method of
	 * Comparable class which takes the object of class Student as a parameter, and
	 * we need to compare the values/ attributes by which we want to sort the list
	 * and return accordingly in the compareTo() function.
	 */

	/* 
	 * SORTING ON BASIS OF SALARY 
	 * 
	 * @Override public int compareTo(Employee o) { int compareSalary=o.getSalary();
	 * //For Ascending order //return this.salary-compareSalary;
	 * 
	 * //For Descending order return compareSalary-this.salary;
	 * 
	 * }
	 */
	
	/*
	 * SORTING ON BASIS OF EMP ID
	 */
	/*
	 * @Override public int compareTo(Employee o) { int compareId=o.getEmpId();
	 * //For Ascending Order return this.empId-compareId;
	 * 
	 * }
	 */

	/*
	 * SORTING ON BASIS OF EMP NAME
	 */
	@Override
	public int compareTo(Employee o) {
		String name = o.getEmpName();
		//for ascending
		return this.empName.compareTo(name);
		
		//for descending
		//return name.compareTo(this.empName);
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}

}
}
