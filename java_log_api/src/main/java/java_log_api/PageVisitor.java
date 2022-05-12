package java_log_api;

import java.util.logging.Logger;

import java_log_api.log.LogFactory;

public class PageVisitor {
	private static final Logger logger = LogFactory.getLogger();
	
	public static void main(String[] args) {
		
		logger.warning("user visited page");
		logger.info("user visited page");
//		logger.severe("user visited page");
		
		
		
		
		
	}

}
