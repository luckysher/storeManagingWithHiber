package storage;

import junit.framework.TestCase;
import logger.LogFactory;
import utils.HibernateUtils;

public class StorageTests extends TestCase{
	
	LogFactory logger = null;
	//constructor
	public StorageTests(){
		this.logger = new LogFactory("StorageTests");
	}
	
	// testcase for checking session connection
	public void testSessionConnection()  throws Exception{
		
		this.logger.info("Testing session connection");
		this.logger.info("Current session:>>> " + HibernateUtils.getSessionFactory().getCurrentSession());
	}
}
