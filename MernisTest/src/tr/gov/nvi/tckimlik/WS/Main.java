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

		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("41956226724"), ("ÜMMÜ GÜLSÜM"), ("ÖZASLAN"), 1998);

		System.out.println("DOÐRULAMA :" + (result ? "baþarýlý" : "baþarýsýz"));

		

//		BaseCustomerManager customerManager = new StarbucksCustomerManager();
//		LocalDate dateOfBirth = LocalDate.of(1998, 8, 19);  
//		Customer customer = new Customer(1,"Gülsüm","Özaslan",dateOfBirth,"41956226724");
//		
//		customerManager.save(customer);
//				
	}

}
