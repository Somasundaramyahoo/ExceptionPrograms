package com.log4jExample;

//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SecondProgram {
	
	static Logger log= Logger.getLogger(SecondProgram.class); 
    public static void main (String[] args){
   	 PropertyConfigurator.configure("log4j.properties");
   	 log.info("Information");
   	 log.warn("warning");
   	 log.error("error occures");
   	 log.fatal("critical error");
   	 log.debug("debugging the error ");
   	 
    }

}
