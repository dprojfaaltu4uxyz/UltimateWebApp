package com.webapp.project.framework.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogicUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(LogicUtil.class);
	
	public static StringBuilder generateJobNumber(Date date,Long lastSequenceNumber){
		
		StringBuilder jobCardNumber = new StringBuilder("JCNumber-");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		jobCardNumber.append(simpleDateFormat.format(date));
		if(lastSequenceNumber == 0 || lastSequenceNumber == null){
			jobCardNumber.append(String.valueOf("-"+1));
		}else{
			jobCardNumber.append(String.valueOf("-"+lastSequenceNumber));
		}
		
		return jobCardNumber;
	}

}
