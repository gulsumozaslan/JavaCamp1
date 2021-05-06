package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Concrete.StarbucksCustomerManager;


public class Main {

	public static void main(String[] args) throws RemoteException {

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("00000000000"), ("ÜMMÜ GÜLSÜM"), ("ÖZASLAN"), 1998);

		System.out.println("DOÐRULAMA :" + (result ? "baþarýlý" : "baþarýsýz"));

		
		
	}

}
