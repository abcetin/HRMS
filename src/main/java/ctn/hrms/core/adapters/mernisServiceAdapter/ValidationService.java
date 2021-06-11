package ctn.hrms.core.adapters.mernisServiceAdapter;



public interface ValidationService {

	boolean checkIfRealPerson(long NationalityId, String firstName, String lastName, int dateOfYear);
	
}
