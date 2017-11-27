
import logger.LogFactory;
//import java.util.logging.Logger;


public class storeManagerRunner {
	
	public static void main(String[] args) {
		String threadName = "Store Manager";
		LogFactory logger = new LogFactory(threadName);
		logger.info("[%s] Started...", threadName);
			
	}

}
