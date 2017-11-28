package logger;
import java.util.Formatter;
import java.util.logging.Logger;


/*
 * Custom logger class that implements the Logger class 
 * for printing the custom messages
 */



public class LogFactory {
	String LoggerName = "Store Manager";
	Formatter formatter = null;
	Logger logger = null;
	
	
	// Constructor for the log Factory class
	public LogFactory(){		
		this.logger = Logger.getLogger(this.LoggerName);
		this.formatter = new Formatter();
	}
	
	// Constructor for the log Factory class
	public LogFactory(String loggerName){
		if (!loggerName.equals("")){
			this.LoggerName = loggerName;
		}		
		this.logger = Logger.getLogger(this.LoggerName);
		this.formatter = new Formatter();
	}
	
	// set logger name
	public boolean setLoggerName(String loggerName){
		this.LoggerName = loggerName;
		return true;
	}
	
	// return object of this class
	public LogFactory getLogger(String loggerName){
		this.LoggerName = loggerName;
		return this;
	}
	
	// method for printing formatted string
	public void info(String messFrmt, Object ... arg2){
		this.formatter.format(messFrmt, arg2);
		this.logger.info(this.formatter.toString());
	}
	
	// method for printing string without format
	public void info(String mess){
		this.logger.info(mess);
	}
	// method for logging formatted warning messages
	public void warning(String messFrmt, Object ... arg2){
			this.formatter.format(messFrmt, arg2);
			this.logger.warning(this.formatter.toString());
	}
		
	// method for log warnings
	public void warning(String mess){
			this.logger.info(mess);
	}	
}
