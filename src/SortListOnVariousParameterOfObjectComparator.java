import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*The comparator is a lambda which -

1.) Takes two objects from the list o1 and o2,
2.) Compares the two object’s customProperty using compareTo() method,
3.) And finally returns a positive number if o1’s property is greater than o2’s, 
negative if o1’s property is lesser than o2’s, and zero if they are equal.
4.) Based on this, the list is sorted based on the least property to greatest and stored back to list.*/
public class SortListOnVariousParameterOfObjectComparator {
	
	public static void main(String args[]) {
		
		ArrayList<Employee> list= new ArrayList<>();
		list.add(new Employee("Sanskar",46041034,200000));
		list.add(new Employee("Mrinal",45239365,24334535));
		
		// Sorting based on Employee Name
        System.out.println("Employee Name Sorting:");
        
        Collections.sort(list,
                         Employee.empNameComparator);
  
        for (Employee str : list) {
            System.out.println(str);
        }
  
        // Sorting on EmpId property
        System.out.println("Employee ID Sorting:");
        
        Collections.sort(list, Employee.empIdComparator);
        
        for (Employee str : list) {
            System.out.println(str);
        }

	// Sorting on Employee Salary property
    System.out.println("Employee Salary Sorting:");
    
    Collections.sort(list, Employee.empSalaryComparator);
    
    for (Employee str : list) {
        System.out.println(str);
    }
}

	public static class Employee{

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
		 * Sorting ArrayList with Comparator:
		 * 
		 * 1.) We will define another class that will implement the Comparator class of type
		 * of our custom object. For eg, in the below code, our custom class is Student
		 * so another class that we have defined will implement Comparator<Employee>.
		 * 
		 * 2.) This class will override the compare method of the Comparator class which
		 * accepts two objects of the Student class as parameters and returns the
		 * comparison value according to our requirement whether we want to sort the
		 * array in ascending or descending order and on which attribute, we want to
		 * sort the list.
		 */
		public static Comparator<Employee> empNameComparator = new Comparator<Employee>() {
            
		      public int compare(Employee e1, Employee e2)
		              {
		  
		                  String EmployeeName1
		                      = e1.getEmpName().toUpperCase();
		                  String EmployeeName2
		                      = e2.getEmpName().toUpperCase();
		  
		                  // ascending order
		                  return EmployeeName1.compareTo(
		                      EmployeeName2);
		  
		                  // descending order
		                  // return
		                  // EmployeeName2.compareTo(EmployeeName1);
		              }
		          };
		  
		    // Comparator for sorting the list by empId
		    public static Comparator<Employee> empIdComparator = new Comparator<Employee>() {
		              public int compare(Employee e1, Employee e2)
		              {
		  
		                  int empid1 = e1.getEmpId();
		                  int empid2 = e2.getEmpId();
		  
		                  // For ascending order
		                  return empid1 - empid2;
		  
		                  // For descending order
		                  // empid2-empid1;
		              }
		          };
		          
		   //Comparator for sorting the list by Salary
		   public static Comparator<Employee> empSalaryComparator = new Comparator<Employee>() {
			   public int compare(Employee e1, Employee e2) {
				   int empSal1=e1.getSalary();
				   int empSal2=e2.getSalary();
				   
				   //For Ascending order
				   //return empSal1-empSal2;
				   
				 //For Descending order
				 return empSal2-empSal1;
			  }
		   };

			@Override
			public String toString() {
				return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
			}
		
	}
}
