package com.ibm.southside4u.utils;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class CustomLogger {

	
	
	public void methodEntryLogger(Class<?> className,String methodName)
	{
		Logger logger = getLoggerType(className);
		logger.info("In class :"+className.toString() +",In method:"+methodName);
	}
	
	public void InfoLogger(Class<?> className,String message)
	{
		Logger logger = getLoggerType(className);
		logger.info(message);
	}
	
	
	public Logger getLoggerType(Class<?> className)
	{
		Logger log = Logger.getLogger(className);
		return log;
	}
}
