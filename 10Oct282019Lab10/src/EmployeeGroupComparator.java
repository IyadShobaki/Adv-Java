//I Shobaki
//class EmployeeGroupComparator
//Will sort the Employee objects by groupID. 
//If two Employees have the same groupID, sort them by ID.

import java.util.Comparator;

public class EmployeeGroupComparator implements Comparator<Employee>{


	@Override
	public int compare(Employee employee1, Employee employee2) {
		int groupID = employee1.getGroupID() - employee2.getGroupID();
		if(groupID != 0)
			return groupID;
		
		
		int id = employee1.getID() - employee2.getID();
		return id;

		
	}
}
