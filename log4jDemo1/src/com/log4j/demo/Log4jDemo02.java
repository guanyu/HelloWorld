package com.log4j.demo;

import org.apache.log4j.Logger;


public class Log4jDemo02 {

	private static Logger logger = Logger.getLogger(Log4jDemo02.class);

	public static void main(String[] args) {
		logger.debug("This is debug message from Log4jDemo02.");
		// ��¼info�������Ϣ
		logger.info("This is info message from Log4jDemo02.");
		// ��¼error�������Ϣ
		logger.error("This is error message from Log4jDemo02.");
	}
}
