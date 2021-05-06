

import java.rmi.RemoteException;
import java.time.LocalDate;

import Concrete.StarbucksCustomerManager;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class Main {

	public static void main(String[] args) throws RemoteException {

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("00000000000"), ("�MM� G�LS�M"), ("�ZASLAN"), 1998);

		System.out.println("DO�RULAMA :" + (result ? "ba�ar�l�" : "ba�ar�s�z"));

		
		
	}

}
