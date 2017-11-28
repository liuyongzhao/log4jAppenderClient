package testClient;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestLog4j {
	
    @Test  
    public void testSocketAppender() throws Exception{  
        Logger logger = LogManager.getLogger("cd.itcast");  
        Logger barLogger = LogManager.getLogger("cd.itcast.log");  
    	System.out.println(11);
        logger.warn("111 logger warn");  
        logger.debug("222 logger debug");  
        barLogger.info("333 bar logger info");  
        barLogger.debug("444 bar logger debug long long ");  
       
    }

}
