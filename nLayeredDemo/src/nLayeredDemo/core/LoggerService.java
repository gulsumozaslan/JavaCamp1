package nLayeredDemo.core;

public interface LoggerService {       

	void logToSystem(String message);
	
}
//Loglama sistemi ba�ka uygulamalarda da kullan�labilir bundan dolay� core'�n i�ine yazd�k
//Kendi interfacemizi(LoggerService) yazd�k