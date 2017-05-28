package alpha.study.hellolog;

import org.slf4j.*;

/**
 * Hello world!
 *
 */
public class LoggerTest 
{
    static Logger LOGGER = LoggerFactory.getLogger(LoggerTest.class);
    public static void main(String[] args) {
    	for (int i = 30; i > 0; i--)
    		printLog();
    }

    public static void printLog() {
        LOGGER.trace("Hello trace.");    	
        LOGGER.debug("Hello debug.");
        LOGGER.info("Hello info.");
        LOGGER.warn("Hello warn.");
        LOGGER.error("Hello error.");
    }
}
