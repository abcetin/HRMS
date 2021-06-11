package ctn.hrms.core.adapters.mernisServiceAdapter;

import java.rmi.RemoteException;


import org.springframework.stereotype.Component;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter implements ValidationService{

	@Override
	public boolean checkIfRealPerson(long NationalityId, String firstName, String lastName, int dateOfYear) {
		
			
			KPSPublicSoapProxy client=new KPSPublicSoapProxy();
			boolean result=false;
			try {
				result =	client.TCKimlikNoDogrula( NationalityId,firstName,lastName,dateOfYear);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			return result; 

	}
}