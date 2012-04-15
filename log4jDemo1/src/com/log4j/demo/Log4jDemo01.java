package com.log4j.demo;
import org.apache.log4j.Logger;



/**
 * @author admin
 *
 */
public class Log4jDemo01 {
	
	private static Logger logger = Logger.getLogger(Log4jDemo01.class); 
	public static void main(String[] args) {
		logger.debug("This is debug message.");   
		// 记录info级别的信息   
		logger.info("This is info message.");   
		// 记录error级别的信息   
		logger.error("This is error message.");   
		Log4jDemo02.main(new String[]{});
	}

}
