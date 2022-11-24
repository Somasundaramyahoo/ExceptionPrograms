package com.log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FirstProgram {
	static Logger log= Logger.getLogger(FirstProgram.class); 
     public static void main (String[] args){
    	 BasicConfigurator.configure();
    	 log.info("Information");
    	 log.warn("warning");
    	 log.error("error occures");
    	 log.fatal("critical error");
    	 log.debug("debugging the error ");
    	 
     }
}
