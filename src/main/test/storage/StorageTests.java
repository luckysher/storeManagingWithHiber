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
	
	
}
