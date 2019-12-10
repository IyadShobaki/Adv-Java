//I Shobaki
//class EmployeeLastNameComparator
//Will sort the Employee objects by last name

import java.util.Comparator;


public class EmployeeLastNameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee employee1, Employee employee2) {
		Employee e1 = (Employee) employee1;
        Employee e2 = (Employee) employee2;
        int result =  e1.getLastName().compareToIgnoreCase(e2.getLastName());
        if (result != 0)
            return result;
        return e1.getLastName().compareToIgnoreCase(e2.getLastName());
		
	}
	
}
