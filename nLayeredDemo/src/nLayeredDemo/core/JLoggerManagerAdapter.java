package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) { // Normalde burada kendi log kodumu yazmam gerekiyor ama log kodu JLoggerdan gelecek
							
		JLoggerManager manager = new JLoggerManager();   //Dependes injection y�ntemiyle de yaz�labilirdi  ama burada farketmez direkt newleyebilirim
		manager.log(message);

	}
}
//Asl�nda benim adapt�r�m(JLoggerManagerAdapter) kendisi benim interfacemi kullan�yor(LoggerService) ama 
//kendi ismine kendi �ablonuna uygun yap�da JLoggerManager'� �a��r�yor
