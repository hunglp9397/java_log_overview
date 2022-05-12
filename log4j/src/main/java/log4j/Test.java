package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Test {
	final static Logger logger = Logger.getLogger(Test.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		try {
			int a = 1 / 0;
		} catch (Exception e) {
			logger.info(e.getMessage());
		}

	}

	public static void configure() {
		Logger root = Logger.getRootLogger();
		root.addAppender(new ConsoleAppender(new PatternLayout("%r [%t] %p %c %x - %m%n")));
	}

}
