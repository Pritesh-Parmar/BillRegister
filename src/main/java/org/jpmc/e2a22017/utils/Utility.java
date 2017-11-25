package org.jpmc.e2a22017.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

//	Method to generate a Bill Number 
	public String getBillNum() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");
		Date date = new Date();
		return (dateFormat.format(date));
	}
	
	
	
}
