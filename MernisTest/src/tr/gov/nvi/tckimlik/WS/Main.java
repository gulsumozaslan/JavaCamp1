package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Concrete.StarbucksCustomerManager;

//import coffeeCustomerTracking.BaseCustomerManager;
//import coffeeCustomerTracking.Customer;
//import coffeeCustomerTracking.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) throws RemoteException {

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("41956226724"), ("�MM� G�LS�M"), ("�ZASLAN"), 1998);

		System.out.println("DO�RULAMA :" + (result ? "ba�ar�l�" : "ba�ar�s�z"));

		

//		BaseCustomerManager customerManager = new StarbucksCustomerManager();
//		LocalDate dateOfBirth = LocalDate.of(1998, 8, 19);  
//		Customer customer = new Customer(1,"G�ls�m","�zaslan",dateOfBirth,"41956226724");
//		
//		customerManager.save(customer);
//				
	}

}
