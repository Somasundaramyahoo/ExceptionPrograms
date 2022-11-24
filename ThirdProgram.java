package com.log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ThirdProgram {
	
	static Logger log= Logger.getLogger(SecondProgram.class); 
    public static void main (String[] args){
   	       BasicConfigurator.configure();
   	       System.out.println("start");
   	       String a=null;
   	       try{
   	    	   
   	       }
   	       catch(NullPointerException e){
   	    	   log.error("error occure",e);
   	       }
   	       System.out.println("end");
    }

}
