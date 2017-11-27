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
		
}
