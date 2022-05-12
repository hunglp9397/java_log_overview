package java_log_api.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogFactory {
	public static Logger getLogger()  {
		Logger logger =  Logger.getLogger("Java Log");
		
		// Dung de log ra file
		FileHandler fileHandler;
		try {
			fileHandler = new FileHandler("C:/Users/lphung/eclipse-workspace/Logging_Overview/java_log_api/logs/runtime.log");
			fileHandler.setFormatter(new SimpleFormatter());
			
			logger.addHandler(fileHandler);
			logger.setLevel(Level.INFO);
			
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return logger;
		
	}

}
