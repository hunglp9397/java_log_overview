package java_log_api;

import java.util.logging.Logger;

public class Test {

	private static final Logger logger = Logger.getLogger("Java Log");

	public static void main(String[] args) {

		try {
			int b = 1 / 0;
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
