import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( JfxTestRunner.class )
public class TestLogger {
    
    final static Logger logger = Logger.getLogger(TestLogger.class);
       
    
    @Test
    public void logTest(){
        runMe("This is a Test of the Logger");
    }
    
    private void runMe(String parameter) {

        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : " + parameter);
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}
