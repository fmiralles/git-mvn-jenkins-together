package com.testing.example1; 

import org.slf4j.*; 

public class ExampleAction {
	
	final Logger logger = LoggerFactory.getLogger(ExampleAction.class);    
	
	public boolean execute() {        
		logger.info( "Example action executed" );        
		return true;    
	}
} 