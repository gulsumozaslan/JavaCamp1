package nLayeredDemo.core;

public interface LoggerService {       

	void logToSystem(String message);
	
}
//Loglama sistemi baþka uygulamalarda da kullanýlabilir bundan dolayý core'ýn içine yazdýk
//Kendi interfacemizi(LoggerService) yazdýk