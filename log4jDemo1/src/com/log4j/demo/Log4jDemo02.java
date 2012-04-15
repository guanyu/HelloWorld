package com.log4j.demo;

import org.apache.log4j.Logger;


public class Log4jDemo02 {

	private static Logger logger = Logger.getLogger(Log4jDemo02.class);

	public static void main(String[] args) {
		logger.debug("This is debug message from Log4jDemo02.");
		// 记录info级别的信息
		logger.info("This is info message from Log4jDemo02.");
		// 记录error级别的信息
		logger.error("This is error message from Log4jDemo02.");
	}
}
