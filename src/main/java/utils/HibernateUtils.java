package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import logger.LogFactory;

public class HibernateUtils {
	
	private static final SessionFactory sessionFactory;
	public static LogFactory logger = new LogFactory();
	static {
		try{
			logger.info("Initializing session factory..");
			sessionFactory = new AnnotationConfiguration().configure("/applicationContext.xml").buildSessionFactory();
		}catch(Throwable ex){
			logger.warning("Got exception while creating session factory: %s", ex);
			throw new ExceptionInInitializerError(ex);
		}		
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
