package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) { // Normalde burada kendi log kodumu yazmam gerekiyor ama log kodu JLoggerdan gelecek
							
		JLoggerManager manager = new JLoggerManager();   //Dependes injection yöntemiyle de yazýlabilirdi  ama burada farketmez direkt newleyebilirim
		manager.log(message);

	}
}
//Aslýnda benim adaptörüm(JLoggerManagerAdapter) kendisi benim interfacemi kullanýyor(LoggerService) ama 
//kendi ismine kendi þablonuna uygun yapýda JLoggerManager'ý çaðýrýyor
